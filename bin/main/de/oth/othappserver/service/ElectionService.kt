package de.oth.othappserver.service

import com.fasterxml.jackson.databind.ObjectMapper
import de.oth.othappserver.Tables
import de.oth.othappserver.model.Candidate
import de.oth.othappserver.model.ElectionInfo
import de.oth.othappserver.tables.records.ElectionCandidateRecord
import de.oth.othappserver.tables.records.ElectionInfoRecord
import org.jooq.DSLContext
import org.jooq.JSON
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.zalando.problem.Problem
import org.zalando.problem.Status

@Service
@Transactional(propagation = Propagation.REQUIRED)
open class ElectionService @Autowired constructor(
    private val dsl: DSLContext,
    private val objectMapper: ObjectMapper
) : IElectionService {

    private fun fetchOneCandidateRecord(id: Int?) =
        dsl.fetchOne(Tables.ELECTION_CANDIDATE.where(Tables.ELECTION_CANDIDATE.ID.eq(id)))
            ?: throw Problem.valueOf(Status.NOT_FOUND, "ELECTION_CANDIDATE with id='$id' not found.")

    private fun mapEntityToDto(record: ElectionCandidateRecord): Candidate {
        val candidate = objectMapper.readValue(record.info.data(), Candidate::class.java)
        return candidate.copy(id = record.id)
    }

    override fun insertCandidate(candidate: Candidate, candidateImage: Resource?): Int? {
        val json = JSON.json(objectMapper.writeValueAsString(candidate))
        val resourceBytes = candidateImage?.inputStream?.readAllBytes()
        return dsl.insertInto(Tables.ELECTION_CANDIDATE, Tables.ELECTION_CANDIDATE.INFO, Tables.ELECTION_CANDIDATE.IMAGE)
            .values(json, resourceBytes)
            .returningResult(Tables.ELECTION_CANDIDATE.ID)
            .fetchOne()
            ?.value1()
    }

    override fun updateCandidate(id: Int?, candidate: Candidate) {
        val json = JSON.json(objectMapper.writeValueAsString(candidate))
        val record = fetchOneCandidateRecord(id)
        if (record.info.equals(json)) {
            throw Problem.valueOf(Status.NOT_MODIFIED)
        }
        record.info = json
        record.update()
    }

    override fun deleteCandidate(id: Int?) {
        fetchOneCandidateRecord(id).delete()
    }

    override fun getCandidateImage(id: Int): Resource {
        val byteArray = fetchOneCandidateRecord(id).image
            ?: throw Problem.valueOf(Status.NOT_FOUND, "Image for ELECTION_CANDIDATE with id='$id' not found.")
        return ByteArrayResource(byteArray)
    }

    override fun updateCandidateImage(id: Int, resource: Resource) {
        val resourceBytes = resource.inputStream.readAllBytes()
        val electionCandidateRecord = fetchOneCandidateRecord(id)
        electionCandidateRecord.image = resourceBytes
        electionCandidateRecord.update()
    }

    override fun getCandidates(): List<Candidate> {
        return dsl.select()
            .from(Tables.ELECTION_CANDIDATE)
            .fetchInto(ElectionCandidateRecord::class.java)
            .map { mapEntityToDto(it) }
    }

    override fun getCandidate(id: Int): Candidate {
        return mapEntityToDto(fetchOneCandidateRecord(id))
    }

    override fun getInfo(): ElectionInfo? {
        val json = dsl.select()
            .from(Tables.ELECTION_INFO)
            .fetchAny(Tables.ELECTION_INFO.INFO)
            ?.data() ?: return null
        return objectMapper.readValue(json, ElectionInfo::class.java)
    }

    override fun updateInfo(electionInfo: ElectionInfo?) {
        var electionInfoInfoToSave = electionInfo
        if (electionInfo != null) {
            val regex = "(\\r\\n|\\\\n)".toRegex()
            electionInfoInfoToSave = electionInfo.copy(
                howToVoteShort = electionInfo.howToVoteShort.toString().replace(regex, "\n"),
                howToVoteLong = electionInfo.howToVoteLong.toString().replace(regex, "\n"),
                whatToVoteKonvent = electionInfo.whatToVoteKonvent.toString().replace(regex, "\n"),
                whatToVoteFaculty = electionInfo.whatToVoteFaculty.toString().replace(regex, "\n"),
                whatToVoteSenat = electionInfo.whatToVoteSenat.toString().replace(regex, "\n")
            )
        }
        val json = JSON.json(objectMapper.writeValueAsString(electionInfoInfoToSave))
        dsl.insertInto(Tables.ELECTION_INFO)
            .set(ElectionInfoRecord(0, json))
            .onDuplicateKeyUpdate()
            .set(Tables.ELECTION_INFO.INFO, json)
            .execute()
    }
}
