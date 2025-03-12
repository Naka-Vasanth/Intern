package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class display_details_pay_slip {
    public static void e_display_pay_slip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of the employee:");
        int i = sc.nextInt();
        System.out.println("If you want to display every month payslip then press 1");
        System.out.println("If you want to display a particular month payslip then press 2");
        int ch = sc.nextInt();

        Configuration con = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Payslip_hibernate.class)
                .addAnnotatedClass(Employee_hibernate.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

            Transaction tx = session.beginTransaction();
            switch (ch) {
                case 1: {
                    List<Payslip_hibernate> payslips = session.createQuery("from Payslip_hibernate where employee.id = :i", Payslip_hibernate.class)
                            .setParameter("i", i)
                            .list();
                    for (Payslip_hibernate payslip : payslips) {
                        System.out.println("MONTH : " + payslip.getMonth());
                        System.out.println("GROSS SALARY : " + payslip.getGross_Salary());
                        System.out.println("DEDUCTIONS : " + payslip.getDeductions());
                        System.out.println("NET SALARY : " + payslip.getNet_salary());
                        System.out.println("_______________________________________________");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the month of the payslip to be displayed:");
                    String month = sc.next();
                    Payslip_hibernate payslip = session.createQuery("from Payslip_hibernate where employee.id = :i and month = :month", Payslip_hibernate.class)
                            .setParameter("i", i)
                            .setParameter("month", month)
                            .uniqueResult();
                    if (payslip != null) {
                        System.out.println("MONTH : " + payslip.getMonth());
                        System.out.println("GROSS SALARY : " + payslip.getGross_Salary());
                        System.out.println("DEDUCTIONS : " + payslip.getDeductions());
                        System.out.println("NET SALARY : " + payslip.getNet_salary());
                        System.out.println("_______________________________________________");
                    } else {
                        System.out.println("No such month's payslip is available");
                        System.out.println("_______________________________________________");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
            tx.commit();
    }

    public static void main(String[] args) {
        e_display_pay_slip();
    }
}
