package com.example.cadidate.data;

import com.example.cadidate.enums.Roles;
import com.example.cadidate.models.Candidate;
import com.example.cadidate.models.Experience;
import com.example.cadidate.repositories.CandidateRepository;
import com.example.cadidate.repositories.ExperienceRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddData {
    public static void main(String[] args) {
//        Experience exp1 = new Experience(LocalDate.of(2021,10,20), "Intern IT", Roles.STAFF,"HB" , LocalDate.of(2021,12, 20));
//        Experience exp2 = new Experience(LocalDate.of(2021,10,11), "Intern Help Desk", Roles.STAFF,"HB" , LocalDate.of(2021,12, 20));
//        Experience exp3 = new Experience(LocalDate.of(2021,10,22), "Junior IT", Roles.STAFF,"HB" , LocalDate.of(2021,12, 21));
//        Experience exp4 = new Experience(LocalDate.of(2021,10,11), "Middle IT", Roles.STAFF,"HB" , LocalDate.of(2023,12, 21));
//        Experience exp5 = new Experience(LocalDate.of(2021,10,22), "Senior IT", Roles.STAFF,"HB" , LocalDate.of(2023,12, 21));

//        List<Experience> experiences1 = new ArrayList<>();
//        experiences1.add(exp1);
//        experiences1.add(exp2);
//        experiences1.add(exp3);
//
//        List<Experience> experiences2 = new ArrayList<>();
//        experiences1.add(exp1);
//        experiences1.add(exp2);
//        experiences1.add(exp4);
//
//        List<Experience> experiences3 = new ArrayList<>();
//        experiences1.add(exp1);
//        experiences1.add(exp2);
//        experiences1.add(exp5);
        Candidate candidate1 = new Candidate(null,"Võ Tấn Đạt","032967203",null);
        Experience exp1 = new Experience(LocalDate.of(2021,10,20), "Intern IT", Roles.STAFF,"HB" , LocalDate.of(2021,12, 20),candidate1);
        Experience exp2 = new Experience(LocalDate.of(2021,10,11), "Intern Help Desk", Roles.STAFF,"HB" , LocalDate.of(2021,12, 20),candidate1);
        Experience exp3 = new Experience(LocalDate.of(2021,10,22), "Junior IT", Roles.STAFF,"HB" , LocalDate.of(2021,12, 21),candidate1);
        List<Experience> experiences = List.of(exp1, exp2, exp3);
        candidate1.setExperences(experiences);

        //        Candidate candidate2 = new Candidate("tandatvok16@gmail.com","Võ Tấn Đạt","032967203",experiences2);
//        Candidate candidate3 = new Candidate("tandatvok16@gmail.com","Võ Tấn Đạt","032967203",experiences3);

//        ExperienceRepository experienceRepository = new ExperienceRepository();
//        Experience exp6= new Experience(LocalDate.of(2021,10,20), "Intern IT", Roles.STAFF,"HB" , LocalDate.of(2021,12, 20), candidate1);

        CandidateRepository repository = new CandidateRepository();
        repository.insert(candidate1);
//        repository.insert(candidate1);
//        experienceRepository.insert(exp6);
//        repository.insert(candidate2);
//        repository.insert(candidate3);

    }
}
