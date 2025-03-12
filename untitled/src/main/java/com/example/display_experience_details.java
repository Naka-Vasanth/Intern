package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.*;

public class display_experience_details {

    public static void e_display_experience_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID");
        int i=sc.nextInt();
        Configuration con = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Experience_hibernate.class)
                .addAnnotatedClass(Employee_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        List<Experience_hibernate> experiences = session.createQuery("from Experience_hibernate where employee.id = :i", Experience_hibernate.class)
                .setParameter("i", i)
                .list();

        List<Employee_hibernate> employees = session.createQuery("from Employee_hibernate where id = :i", Employee_hibernate.class)
                .setParameter("i", i)
                .list();
        for(Employee_hibernate employee:employees)
        {
            System.out.println("ID : "+employee.getid());
            System.out.println("NAME : "+employee.getname());
            System.out.println("AGE : "+employee.getage());
            System.out.println("DEPARTMENT : "+employee.getdept());
            System.out.println("DATE OF BIRTH : "+employee.getdate());
        }
        for(Experience_hibernate experience:experiences)
        {
            System.out.println("START DATE OF JOB : "+experience.getStart_date());
            System.out.println("END DATE OF JOB : "+experience.getEnd_date());
            System.out.println("EXPERIENCE : "+experience.getExperience());
            System.out.println("ACHIEVEMENTS : "+experience.getAchievement());
            System.out.println("BONUS : "+experience.getBonus());
            System.out.println("_______________________________________________");

        }
    }
    public static void main()
    {
        e_display_experience_details();
    }
}
