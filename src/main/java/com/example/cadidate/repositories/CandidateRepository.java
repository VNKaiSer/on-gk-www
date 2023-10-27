package com.example.cadidate.repositories;

import com.example.cadidate.models.Candidate;
import com.example.cadidate.repositories.instance.DBInstance;
import jakarta.persistence.EntityManager;

public class CandidateRepository extends CRUDRepository<Candidate>{
    private EntityManager manager;
    public CandidateRepository(){
        manager = DBInstance.connect().getEntityManager();
    }


}
