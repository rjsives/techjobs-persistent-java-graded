package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job(Employer anEmployer, List<Skill> someSkills) {
        this.employer = anEmployer;
        this.skills = someSkills;
    }

//    public Job(Employer anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

    public Job() {
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
