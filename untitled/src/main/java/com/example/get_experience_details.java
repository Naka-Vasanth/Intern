package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;

public class get_experience_details {

    public static void e_get_experience_details()
    {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the employee's ID");
            int i=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the employee's career start date as yy-mm-dd");
            String s_date=sc.next();
            sc.nextLine();
            System.out.println("Enter the employee's end date as yy-mm-dd");
            String e_date=sc.next();
            sc.nextLine();
            System.out.println("Enter the employee's achievements");
            String a=sc.nextLine();
            int first1=s_date.indexOf('-');
            String s_year=s_date.substring(0,first1);
            int first2=e_date.indexOf('-');
            String e_year=e_date.substring(0,first2);
            int year1=Integer.parseInt(s_year);
            int year2=Integer.parseInt(e_year);
            int ex=year2-year1;
            Experience_hibernate ob=new Experience_hibernate();
            Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee_hibernate.class).addAnnotatedClass(Experience_hibernate.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Employee_hibernate ee=session.get(Employee_hibernate.class,i);
            ob.setStart_date(s_date);
            ob.setEnd_date(e_date);
            ob.setExperience(ex);
            ob.setAchievement(a);
            ob.setEmployee(ee);
            Transaction tx = session.beginTransaction();
            if(ex>1&&ex<=3)
            {
                ob.setBonus(4000);
            }
            else if(ex>3&&ex<=5)
            {
                ob.setBonus(6000);
            }
            else if(ex>5&&ex<=7)
            {
                ob.setBonus(8000);
            }
            else if(ex>7&&ex<=9)
            {
                ob.setBonus(10000);
            }
            else
            {
                ob.setBonus(20000);
            }
            session.save(ob);
            tx.commit();
        }
        catch(Exception e)
        {
            System.out.println("This ID's detail is already present");
        }
    }
    public static void main()
    {
        e_get_experience_details();
    }

}

