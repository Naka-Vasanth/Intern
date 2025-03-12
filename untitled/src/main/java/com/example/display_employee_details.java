package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import java.util.*;

public class display_employee_details {

    public static void e_display_employee_details()
    {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        List<Employee_hibernate> employees=session.createQuery("from Employee_hibernate",Employee_hibernate.class).list();
        for(Employee_hibernate employee:employees)
        {
            System.out.println("ID : "+employee.getid());
            System.out.println("NAME : "+employee.getname());
            System.out.println("AGE : "+employee.getage());
            System.out.println("DEPARTMENT : "+employee.getdept());
            System.out.println("DATE OF BIRTH : "+employee.getdate());
            System.out.println("_______________________________________________");
        }
        tx.commit();
    }
    public static void main()
    {
        e_display_employee_details();
    }
}
