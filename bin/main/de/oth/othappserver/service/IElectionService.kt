package de.oth.othappserver.service

import de.oth.othappserver.model.Candidate
import de.oth.othappserver.model.ElectionInfo
import org.springframework.core.io.Resource

interface IElectionService {

    fun getCandidates(): List<Candidate>
    fun getCandidate(id: Int): Candidate?
    fun insertCandidate(candidate: Candidate, candidateImage: Resource?): Int?
    fun updateCandidate(id: Int?, candidate: Candidate)
    fun deleteCandidate(id: Int?)
    fun getCandidateImage(id: Int): Resource?
    fun updateCandidateImage(id: Int, resource: Resource)
    fun getInfo(): ElectionInfo?
    fun updateInfo(electionInfo: ElectionInfo?)
}
