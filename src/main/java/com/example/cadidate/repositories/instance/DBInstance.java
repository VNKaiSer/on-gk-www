package com.example.cadidate.repositories.instance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.mariadb.jdbc.Connection;

public class DBInstance {
    private static DBInstance instance;
    EntityManager em;
    private DBInstance(){
        em =     Persistence
                .createEntityManagerFactory("default")
                .createEntityManager();
    }


    public static DBInstance connect(){
        if (instance == null){
            instance = new DBInstance();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public static void main(String[] args) {
        DBInstance.connect().getEntityManager();
    }
}
