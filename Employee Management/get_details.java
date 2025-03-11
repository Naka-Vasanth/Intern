import java.util.*;

public class get_details 
{
    public static void e_details() 
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("How many employee details:");
        int n = sc.nextInt();
        
        for (; i <= n; i++) 
        {
            System.out.println("Enter the employee " + i + "'s ID:");
            int x = sc.nextInt();
            System.out.println("Enter the name of the employee " + i + ":");
            String s = sc.next();
            System.out.println("Enter the age of the employee " + i + ":");
            int a = sc.nextInt();
            System.out.println("Enter the department of the employee " + i + ":");
            String d = sc.next();
            System.out.println("Enter the date of birth of the employee as yy-mm-dd:");
            String dob = sc.next();

            // You can store these details in a data structure if needed
            // For example, creating a simple output to show the entered details
            System.out.println("Employee " + i + " Details:");
            System.out.println("ID: " + x + ", Name: " + s + ", Age: " + a + ", Department: " + d + ", Date of Birth: " + dob);
        }
        
    }

    public static void main(String[] args) 
    {
        e_details();
    }
}
