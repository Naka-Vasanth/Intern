import java.util.*;

public class get_experience_details {

    public static void eGetExperienceDetails() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the employee's ID:");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.println("Enter the employee's career start date as yy-mm-dd:");
            String startDate = sc.next();
            sc.nextLine(); // Consume the newline

            System.out.println("Enter the employee's end date as yy-mm-dd:");
            String endDate = sc.next();
            sc.nextLine(); // Consume the newline

            System.out.println("Enter the employee's achievements:");
            String achievements = sc.nextLine();

            int startYear = Integer.parseInt(startDate.split("-")[0]);
            int endYear = Integer.parseInt(endDate.split("-")[0]);
            int experience = endYear - startYear;

            // Display the employee experience details
            System.out.println("Employee ID: " + id);
            System.out.println("Career Start Date: " + startDate);
            System.out.println("End Date: " + endDate);
            System.out.println("Experience (years): " + experience);
            System.out.println("Achievements: " + achievements);

            int salary;
            if (experience > 1 && experience <= 3) {
                salary = 4000;
            } else if (experience > 3 && experience <= 5) {
                salary = 6000;
            } else if (experience > 5 && experience <= 7) {
                salary = 8000;
            } else if (experience > 7 && experience <= 9) {
                salary = 10000;
            } else {
                salary = 20000;
            }

            System.out.println("Calculated Salary: " + salary);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner to prevent resource leaks
        }
    }
    public static void main(String[] args) {
        eGetExperienceDetails();
    }
}
