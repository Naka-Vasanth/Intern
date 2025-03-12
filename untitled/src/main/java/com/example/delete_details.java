package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class delete_details {

    public static void e_delete_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee ID");
        int n=sc.nextInt();
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee_hibernate employee=session.get(Employee_hibernate.class,n);
        if(employee!=null)
        session.delete(employee);
        else
            System.out.println("NO SUCH ID EXISTS");
        tx.commit();
    }
    public static void main()
    {
        e_delete_details();
    }
}
