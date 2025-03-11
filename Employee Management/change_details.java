import java.util.*;

public class change_details {
    
    public static void e_change_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID");
        int n = sc.nextInt();
        System.out.println("Press 1-change employee ID");
        System.out.println("Press 2-change employee name");
        System.out.println("Press 3-change employee age");
        System.out.println("Press 4-change employee department");
        System.out.println("Press 5-change employee date of birth");
        int ch = sc.nextInt();
        
        if (ch == 1) {
            System.out.println("Enter the ID to be changed");
            int i = sc.nextInt();
            System.out.println("Changing employee ID from " + n + " to " + i);
        }
        if (ch == 2) {
            System.out.println("Enter the NAME to be changed");
            String i = sc.next();
            System.out.println("Changing employee name for ID " + n + " to " + i);
        }
        if (ch == 3) {
            System.out.println("Enter the AGE to be changed");
            int k = sc.nextInt();
            System.out.println("Changing employee age for ID " + n + " to " + k);
        }
        if (ch == 4) {
            System.out.println("Enter the DEPARTMENT to be changed");
            String d = sc.next();
            System.out.println("Changing employee department for ID " + n + " to " + d);
        }
        if (ch == 5) {
            System.out.println("Enter the DATE OF BIRTH to be changed");
            String dob = sc.next();
            System.out.println("Changing employee date of birth for ID " + n + " to " + dob);
        }
    }

    public static void main() {
        e_change_details();
    }
}
