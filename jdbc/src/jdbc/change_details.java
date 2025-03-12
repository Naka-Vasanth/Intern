package jdbc;

import java.sql.*;

import java.util.*;
public class change_details {
	
public static void e_change_details()throws SQLException
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employee ID");
    int n=sc.nextInt();
    System.out.println("Press 1-change employee ID");
    System.out.println("Press 2-change employee name");
    System.out.println("Press 3-change employee age");
    System.out.println("Press 4-change employee department");
    System.out.println("Press 5-change employee date of birth");
    int ch=sc.nextInt();
    Connection con=emp_connection.e_connection();
    if(ch==1)
    {
        System.out.println("Enter the ID to be changed");
        int i=sc.nextInt();
        String query="update employee set id ="+i+" where id="+n+";";
        Statement st=con.createStatement();
        st.executeUpdate(query);
        
    }
    if(ch==2)
    {
        System.out.println("Enter the NAME to be changed");
        String i=sc.next();
        String query="update employee set name ="+"\""+i+"\""+" where id="+n+";";
        Statement st=con.createStatement();
        st.executeUpdate(query);
            }
    if(ch==3)
    {
        System.out.println("Enter the AGE to be changed");
        int k=sc.nextInt();
        String query="update employee set age ="+k+" where id="+n+";";
        Statement st=con.createStatement();
        st.executeUpdate(query);
            }
    if(ch==4)
    {
        System.out.println("Enter the DEPARTMENT to be changed");
        String d=sc.next();
        String query="update employee set dept ="+"\""+d+"\""+" where id="+n+";";
        Statement st=con.createStatement();
        st.executeUpdate(query);
            }
    if(ch==5)
    {
        System.out.println("Enter the DATE OF BIRTH  to be changed");
        String dob=sc.next();
        String query="update employee set dob ="+"\""+dob+"\""+" where id="+n+";";
        Statement st=con.createStatement();
        st.executeUpdate(query);
            }
}
public static void main()throws SQLException
{
	e_change_details(); 
}
}

