package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class get_details
{
    public static void e_details()
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("How many employee details");
        int n=sc.nextInt();
        for(;i<=n;i++)
        {
            System.out.println("Enter the employee"+i+"'s"+" "+"ID");
            int x=sc.nextInt();
            System.out.println("Enter the name of the employee"+i);
            String s=sc.next();
            System.out.println("Enter the age of the employee"+i);
            int a=sc.nextInt();
            System.out.println("Enter the department of the employee"+i);
            String d=sc.next();
            System.out.println("Enter the date of birth of the employee as yy-mm-dd");
            String dob=sc.next();
            Employee_hibernate ob=new Employee_hibernate();
            ob.setid(x);
            ob.setname(s);
            ob.setage(a);
            ob.setdept(d);
            ob.setdate(dob);
            Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.save(ob);
            tx.commit();
        }

    }
    public static void main(String[] args)
    {
        e_details();
    }
}
