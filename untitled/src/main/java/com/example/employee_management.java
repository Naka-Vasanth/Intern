package com.example;

import java.util.*;

class employee_management
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("A-To enter the details of the employee");
            System.out.println("B-To change the details of an employee");
            System.out.println("C-To delete the details of an employee");
            System.out.println("D-To display the details of the employees");
            System.out.println("E-To enter the details to the payslip");
            System.out.println("F-To display the payslip of an employee");
            System.out.println("G-To enter the experience details of an employee");
            System.out.println("H-To display the experience details of an employee");
            System.out.println("I-To exit");
            String c=sc.next();
            switch(c)
            {
                case "A":
                {
                    get_details.e_details();
                    break;
                }
                case "B":
                {
                    change_details.e_change_details();
                    break;
                }
                case "C":
                {
                    delete_details.e_delete_details();
                    break;
                }
                case "D":
                {
                    display_employee_details.e_display_employee_details();
                    break;
                }
                case "E":
                {
                    get_details_pay_slip.e_details_pay_slip();
                    break;
                }
                case "F":
                {
                    display_details_pay_slip.e_display_pay_slip();
                    break;
                }
                case "G":
                {
                    get_experience_details.e_get_experience_details();
                    break;
                }
                case "H":
                {
                    display_experience_details.e_display_experience_details();
                    break;
                }
                case "I":
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("No such choice");
                }
            }
        }
    }
}