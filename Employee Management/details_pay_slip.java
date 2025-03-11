import java.util.*;

public class details_pay_slip {

    public static void e_details_pay_slip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of the employee");
        int i = sc.nextInt();
        System.out.println("Enter the gross salary of the employee");
        int e = sc.nextInt();
        System.out.println("Enter the total deduction in the salary of an employee");
        int d = sc.nextInt();
        System.out.println("Enter the month of the payslip of the employee");
        String m = sc.next();
        int n = e - d;

        // Simulate the database insertion by printing out the details
        System.out.println("Simulating insertion into payslip:");
        System.out.println("Employee ID: " + i);
        System.out.println("Gross Salary: " + e);
        System.out.println("Deductions: " + d);
        System.out.println("Net Salary: " + n);
        System.out.println("Month: " + m);
    }

    public static void main() {
        e_details_pay_slip();
    }
}
