package com.example.cadidate.services.impl;

import com.example.cadidate.models.Candidate;
import com.example.cadidate.repositories.CandidateRepository;
import com.example.cadidate.services.CandidateService;

import java.util.List;
import java.util.Optional;

public class CandidateServicesImpl implements CandidateService {
    private final CandidateRepository repository;
    public CandidateServicesImpl(){
        repository = new CandidateRepository();
    }
    @Override
    public List<Candidate> getAllCandidate() {
        return repository.getAll(Candidate.class);
    }

    @Override
    public Candidate getCandidateDetail(long id) throws Exception {
        Optional<Candidate> candidate = repository.get(Candidate.class,id);
        if (candidate.isEmpty())
                throw new Exception("Not fund");
        return candidate.get();
    }

    @Override
    public boolean insert(Candidate candidate) {
        return repository.insert(candidate);
    }
}
