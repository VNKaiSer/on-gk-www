package com.example.cadidate.services;

import com.example.cadidate.models.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAllCandidate();
    Candidate getCandidateDetail(long id) throws Exception;
    boolean insert(Candidate candidate);
    List<Candidate> findCandidateByRole(int role);
    List<Candidate> findCandidateHasEmail();
}
