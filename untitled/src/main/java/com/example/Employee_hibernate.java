package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;
@Entity // This annotation marks the class as a persistent entity
public class Employee_hibernate { // Class names should start with a capital letter
    @Id // This annotation marks the primary key
    private int id;
    private String name;
    private int age;
    private String dept;
    private String date;
    public int getid() {
        return id;
    }

    public void setid(int id) {

        this.id = id;
    }

    public String getname() {

        return name;
    }

    public void setname(String name) {

        this.name = name;
    }

    public int getage() {

        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getdept() {
        return dept;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }
}
