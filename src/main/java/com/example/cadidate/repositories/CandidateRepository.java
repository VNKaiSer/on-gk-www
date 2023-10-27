package com.example.cadidate.repositories;

import com.example.cadidate.enums.Roles;
import com.example.cadidate.models.Candidate;
import com.example.cadidate.repositories.instance.DBInstance;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class CandidateRepository extends CRUDRepository<Candidate>{
    private ExperienceRepository repository;
    public CandidateRepository(){
        EntityManager manager = DBInstance.connect().getEntityManager();
    }

    public List<Candidate> findCandidateByRole(int role) {
        List<Candidate> candidates = new ArrayList<>();
        try {
            transaction.begin();
            Query query = entityManager.createNamedQuery("candidate.findCandidateByRole")
                    .setParameter("role", Roles.values()[role]);
            candidates = query.getResultList();
            transaction.commit();

        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return candidates;

    }

    public List<Candidate> findCandidateHasEmail() {
        List<Candidate> candidates = new ArrayList<>();
        try {
            transaction.begin();
            Query query = entityManager.createNamedQuery("candidates.findCandidateHasEmail");
            candidates = query.getResultList();
            transaction.commit();

        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return candidates;
    }
}
