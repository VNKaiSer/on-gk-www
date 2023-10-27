package com.example.cadidate.models;

import com.example.cadidate.enums.Roles;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "from_date")
    private LocalDate fromDate;
    @Column(name = "work_desc")
    private String workDescription;
    private Roles role;
    @Column(name = "company")
    private String companyName;
    @Column(name = "to_date")
    private LocalDate toDate;
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    public Experience() {
    }

    public Experience(LocalDate fromDate, String workDescription, Roles role, String companyName, LocalDate toDate) {
        this.fromDate = fromDate;
        this.workDescription = workDescription;
        this.role = role;
        this.companyName = companyName;
        this.toDate = toDate;
    }

    public Experience(LocalDate fromDate, String workDescription, Roles role, String companyName, LocalDate toDate, Candidate candidate) {
        this.fromDate = fromDate;
        this.workDescription = workDescription;
        this.role = role;
        this.companyName = companyName;
        this.toDate = toDate;
        this.candidate = candidate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", fromDate=" + fromDate +
                ", workDescription='" + workDescription + '\'' +
                ", role=" + role +
                ", companyName='" + companyName + '\'' +
                ", toDate=" + toDate +
                ", candidate=" + candidate +
                '}';
    }
}
