package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

@Entity
public class Job{

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Employer employer;
    private Skill skills;

    public Job() {
    }

    public Job(Employer employer, Skill skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }
}
