package jdbc;

import java.sql.*;

import java.util.*;

public class display_employee_details {
	
	public static void e_display_employee_details()throws SQLException
	{
		String query="select * from employee;";
		Connection con=emp_connection.e_connection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println("ID is: "+rs.getInt(1));
			System.out.println("NAME is: "+rs.getString(2));
			System.out.println("AGE is: "+rs.getInt(3));
			System.out.println("DEPARTMENT is: "+rs.getString(4));
			System.out.println("DATE OF BIRTH is: "+rs.getString(5));
			System.out.println("_______________________________________________");

		}
	}
public static void main()throws SQLException
{
	e_display_employee_details();
}
}
