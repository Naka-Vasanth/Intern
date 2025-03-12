package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class get_details_pay_slip {

    public static void e_details_pay_slip()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID of the employee");
        int i=sc.nextInt();
        System.out.println("Enter the gross salary of the employee");
        double e=sc.nextDouble();
        System.out.println("Enter the total deduction in the salary of an employee");
        double d=sc.nextDouble();
        System.out.println("Enter the month of the payslip of the employee");
        String m=sc.next();
        double n=e-d;
        Payslip_hibernate ob=new Payslip_hibernate();
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class).addAnnotatedClass(Payslip_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        List<?> payslipList = session.createQuery("from Payslip_hibernate p where p.employee.id = :i and p.month = :m")
                .setParameter("i", i)
                .setParameter("m", m)
                .getResultList();

        if (!payslipList.isEmpty()) {
            System.out.println("Payslip already exists for the given employee ID and month.");
            return;
        }
            Employee_hibernate ee = session.get(Employee_hibernate.class, i);
            ob.setGross_Salary(e);
            ob.setDeductions(d);
            ob.setNet_salary(n);
            ob.setMonth(m);
            ob.setEmployee(ee);
            Transaction tx = session.beginTransaction();
        session.save(ob);
        tx.commit();
    }
    public static void main(String[] args)
    {
        e_details_pay_slip();
    }
}
