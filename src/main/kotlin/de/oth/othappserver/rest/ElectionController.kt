package de.oth.othappserver.rest

import de.oth.othappserver.api.ElectionApi
import de.oth.othappserver.model.Candidate
import de.oth.othappserver.model.ElectionInfo
import de.oth.othappserver.service.IElectionService
import org.springframework.core.io.Resource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.zalando.problem.Problem
import org.zalando.problem.Status
import java.time.LocalDate
import java.util.*

@RestController
open class ElectionController internal constructor(
    private val electionService: IElectionService
) : ElectionApi {

    override fun createCandidate(firstName: String, lastName: String, course: String, term: Int, offices: List<String>, goals: List<String>, faculty: String, id: Int?, motto: String?, file: Resource?): ResponseEntity<String> {
        val mappedOffices = mapOffices(offices)
        val mappedFaculty = mapFaculty(faculty)
        val candidate = Candidate(firstName, lastName, course, term, mappedOffices, goals, mappedFaculty, null, motto)
        return ResponseEntity.ok(electionService.insertCandidate(candidate, file).toString())
    }

    private fun mapFaculty(faculty: String) =
        Candidate.Faculty.values().find { it.value == faculty } ?: throw Problem.valueOf(
            Status.BAD_REQUEST,
            "Candidate.Faculty not fount for value '$faculty'"
        )

    private fun mapOffices(offices: List<String>) =
        offices.map { officeString ->
            Candidate.Offices.values().find { it.value == officeString }
                ?: throw Problem.valueOf(Status.BAD_REQUEST, "Candidate.Offices not found for value '$officeString'")
        }

    override fun createElectionInfo(electionStart: LocalDate, electionEnd: LocalDate, startShowElectionInfo: LocalDate, endShowElectionInfo: LocalDate, howToVoteShort: Any?, howToVoteLong: Any?, whatToVoteSenat: Any?, whatToVoteKonvent: Any?, whatToVoteFaculty: Any?): ResponseEntity<Unit> {
        val electionInfo = ElectionInfo(electionStart, electionEnd, startShowElectionInfo, endShowElectionInfo, howToVoteShort, howToVoteLong, whatToVoteSenat, whatToVoteKonvent, whatToVoteFaculty)
        electionService.updateInfo(electionInfo)
        return ResponseEntity.ok(Unit)
    }

    override fun deleteCandidate(candidateId: Int): ResponseEntity<Unit> {
        electionService.deleteCandidate(candidateId)
        return ResponseEntity.ok(Unit)
    }

    override fun deleteElectionInfo(): ResponseEntity<Unit> {
        electionService.updateInfo(null)
        return ResponseEntity.ok(Unit)
    }

    override fun getCandidateById(candidateId: Int): ResponseEntity<Candidate> {
        return ResponseEntity.of(Optional.ofNullable(electionService.getCandidate(candidateId)))
    }

    override fun getCandidates(): ResponseEntity<List<Candidate>> {
        return ResponseEntity.ok(electionService.getCandidates())
    }

    override fun getElectionInfo(): ResponseEntity<ElectionInfo> {
        return ResponseEntity.of(Optional.ofNullable(electionService.getInfo()))
    }

    override fun getImageOfCandidate(candidateId: Int): ResponseEntity<Resource> {
        return ResponseEntity.of(Optional.ofNullable(electionService.getCandidateImage(candidateId)))
    }

    override fun updateCandidate(candidateId: Int, firstName: String, lastName: String, course: String, term: Int, offices: List<String>, goals: List<String>, faculty: String, id: Int?, motto: String?): ResponseEntity<Unit> {
        val mappedOffices = mapOffices(offices)
        val mappedFaculty = mapFaculty(faculty)
        val candidate = Candidate(firstName, lastName, course, term, mappedOffices, goals, mappedFaculty, candidateId, motto)
        electionService.updateCandidate(candidateId, candidate)
        return ResponseEntity.ok(Unit)
    }

    override fun uploadPictureOfCandidate(candidateId: Int, file: Resource): ResponseEntity<Unit> {
        electionService.updateCandidateImage(candidateId, file)
        return ResponseEntity.ok(Unit)
    }
}
