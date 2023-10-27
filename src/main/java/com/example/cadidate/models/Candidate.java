package com.example.cadidate.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long id;
    private String email;
    @Column(name = "full_name")
    private String fullName;
    private String phone;
    @OneToMany(mappedBy = "candidate")
    private List<Experience> experiences;

    public Candidate() {
    }

    public Candidate(long id, String email, String fullName, String phone, List<Experience> experences) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.experiences = experences;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperences(List<Experience> experiences) {
        this.experiences= experiences;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", experiences=" + experiences +
                '}';
    }
}
