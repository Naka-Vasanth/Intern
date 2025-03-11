import java.util.*;

class employee_management {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("A - To enter the details of the employee");
            System.out.println("B - To change the details of an employee");
            System.out.println("C - To delete the details of an employee");
            System.out.println("D - To display the details of the employees");
            System.out.println("E - To enter the details to the payslip");
            System.out.println("F - To display the payslip of an employee");
            System.out.println("G - To enter the experience details of an employee");
            System.out.println("H - To display the experience details of an employee");
            System.out.println("I - To exit");
            String c = sc.next();

            switch (c) {
                case "A": {
                    // Simulate entering employee details
                    get_details.e_details();
                    break;
                }
                case "B": {
                    // Simulate changing employee details
                    change_details.e_change_details();
                    break;
                }
                case "C": {
                    // Simulate deleting employee details
                    delete_details.e_delete_details();
                    break;
                }
                case "D": {
                    // Simulate displaying employee details
                    display_employee_details.e_display_employee_details();
                    break;
                }
                case "E": {
                    // Simulate entering payslip details
                    details_pay_slip.e_details_pay_slip();
                    break;
                }
                case "F": {
                    // Simulate displaying payslip of an employee
                    display_details_pay_slip.e_display_pay_slip();
                    break;
                }
                case "G": {
                    // Simulate entering experience details of an employee
                    get_experience_details.eGetExperienceDetails();
                    break;
                }
                case "H": {
                    // Simulate displaying experience details of an employee
                    display_experience_details.e_display_experience_details();
                    break;
                }
                case "I": {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default: {
                    System.out.println("No such choice");
                }
            }
        }
    }
}
