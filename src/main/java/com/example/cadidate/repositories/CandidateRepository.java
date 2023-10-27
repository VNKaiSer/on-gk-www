package com.example.cadidate.repositories;

import com.example.cadidate.repositories.instance.DBInstance;
import jakarta.persistence.EntityManager;

public class CandidateRepository {
    private EntityManager manager;
    public CandidateRepository(){
        manager = DBInstance.connect().getEntityManager();
    }


}
