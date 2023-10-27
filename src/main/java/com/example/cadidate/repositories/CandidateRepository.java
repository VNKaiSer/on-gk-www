package com.example.cadidate.repositories;

import com.example.cadidate.models.Candidate;
import com.example.cadidate.models.Experience;
import com.example.cadidate.repositories.instance.DBInstance;
import jakarta.persistence.EntityManager;

public class CandidateRepository extends CRUDRepository<Candidate>{
    private ExperienceRepository repository;
    public CandidateRepository(){
        EntityManager manager = DBInstance.connect().getEntityManager();
    }
}
