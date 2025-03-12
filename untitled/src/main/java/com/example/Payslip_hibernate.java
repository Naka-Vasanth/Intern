package com.example;

import javax.persistence.*;

@Entity// This annotation marks the class as a persistent entity

public class Payslip_hibernate { // Class names should start with a capital letter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payslip_Id;
    private double gross_salary;
    private double net_salary;
    private double deductions;
    private String month;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_id", nullable = false) // Foreign key column
    private Employee_hibernate employee;

    // Getters and setters


    public double getGross_Salary() {
        return gross_salary;
    }

    public void setGross_Salary(double salary) {
        this.gross_salary = salary;
    }

    public double getNet_salary() {
        return net_salary;
    }

    public void setNet_salary(double net_salary) {
        this.net_salary = net_salary;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Employee_hibernate getEmployee() {
        return employee;
    }

    public void setEmployee(Employee_hibernate employee) {
        this.employee = employee;
    }
}
