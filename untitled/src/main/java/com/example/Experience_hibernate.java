package com.example;

import javax.persistence.*;

@Entity// This annotation marks the class as a persistent entity

public class Experience_hibernate { // Class names should start with a capital letter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int experience_Id;
    private String start_date;
    private String end_date;
    private int experience;
    private String achievement;
    private int bonus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_id", nullable = false) // Foreign key column
    private Employee_hibernate employee;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public Employee_hibernate getEmployee() {
        return employee;
    }

    public void setEmployee(Employee_hibernate employee) {
        this.employee = employee;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
