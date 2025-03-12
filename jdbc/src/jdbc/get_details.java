package jdbc;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class get_details 
{
	public static void e_details() throws SQLException
	{
	Scanner sc=new Scanner(System.in);
	int i=1;
	System.out.println("How many employee details");
	int n=sc.nextInt();
	for(;i<=n;i++)
	{
	System.out.println("Enter the employee"+i+"'s"+" "+"ID");
    int x=sc.nextInt();
    System.out.println("Enter the name of the employee"+i);
    String s=sc.next();
    System.out.println("Enter the age of the employee"+i);
    int a=sc.nextInt();
    System.out.println("Enter the department of the employee"+i);
    String d=sc.next();
    System.out.println("Enter the date of birth of the employee as yy-mm-dd"+i);
    String dob=sc.next();
    Connection con=emp_connection.e_connection();
    String query="insert into employee values(?,?,?,?,?);";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setInt(1, x);
    pst.setString(2,s);
    pst.setInt(3,a);
    pst.setString(4,d);
    pst.setString(5,dob);
    pst.executeUpdate();
	}
	
	}
	public static void main() throws  SQLException
	{
		e_details();
    }
}
