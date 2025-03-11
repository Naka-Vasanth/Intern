import java.util.*;

public class display_details_pay_slip {

    public static void e_display_pay_slip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of the employee");
        int i = sc.nextInt();
        System.out.println("If you want to display every month payslip then press 1");
        System.out.println("If you want to display a particular month payslip then press 2");
        int ch = sc.nextInt();
        
        switch(ch) {
            case 1: {
                System.out.println("Simulating display of every month's payslip for Employee ID: " + i);
                System.out.println("ID: " + i);
                System.out.println("NAME: Simulated Name");
                System.out.println("GROSS SALARY: Simulated Gross Salary");
                System.out.println("DEDUCTIONS: Simulated Deductions");
                System.out.println("NET SALARY: Simulated Net Salary");
                System.out.println("MONTH: Simulated Month");
                System.out.println("-----------------------------------------");
                break;
            }
            case 2: {
                System.out.println("Enter the month of the payslip to be displayed");
                String m = sc.next();
                System.out.println("Simulating display of " + m + " payslip for Employee ID: " + i);
                
                // Simulate retrieval of payslip for the specific month
                System.out.println("ID: " + i);
                System.out.println("NAME: Simulated Name");
                System.out.println("GROSS SALARY: Simulated Gross Salary");
                System.out.println("DEDUCTIONS: Simulated Deductions");
                System.out.println("NET SALARY: Simulated Net Salary");
                System.out.println("MONTH: " + m);
                System.out.println("-----------------------------------------");
                
                // Simulate if no payslip found
                System.out.println("No such month's payslip is available");
                System.out.println("-----------------------------------------");
                break;
            }
        }
    }

    public static void main() {
        e_display_pay_slip();
    }
}
