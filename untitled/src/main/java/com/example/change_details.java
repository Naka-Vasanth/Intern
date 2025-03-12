package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;
public class change_details {

    public static void e_change_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee ID");
        int n=sc.nextInt();
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee_hibernate employee=session.get(Employee_hibernate.class,n);
        System.out.println("Press 1-change employee ID");
        System.out.println("Press 2-change employee name");
        System.out.println("Press 3-change employee age");
        System.out.println("Press 4-change employee department");
        System.out.println("Press 5-change employee date of birth");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter the ID to be changed");
            int i=sc.nextInt();
            employee.setid(i);

        }
        if(ch==2)
        {
            System.out.println("Enter the NAME to be changed");
            String i=sc.next();
            employee.setname(i);

        }
        if(ch==3)
        {
            System.out.println("Enter the AGE to be changed");
            int k=sc.nextInt();
            employee.setage(k);
        }
        if(ch==4)
        {
            System.out.println("Enter the DEPARTMENT to be changed");
            String d=sc.next();
           employee.setdept(d);

        }
        if(ch==5)
        {
            System.out.println("Enter the DATE OF BIRTH  to be changed");
            String dob=sc.next();
            employee.setdate(dob);

        }
        session.update(employee);
        tx.commit();
    }
    public static void main(String[] args)
    {
        e_change_details();
    }
}

