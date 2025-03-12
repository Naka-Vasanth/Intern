package jdbc;

import java.sql.*;

import java.util.*;

public class delete_details {
	
	public static void e_delete_details()throws SQLException
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the employee ID");
	    int n=sc.nextInt();
	    String query="delete from employee where id="+n+";";
	    Connection con=emp_connection.e_connection();
	    Statement st=con.createStatement();
	    st.executeUpdate(query);
	}
public static void main()throws SQLException
{
	e_delete_details();
}
}
