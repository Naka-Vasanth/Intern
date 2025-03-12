package jdbc;

import java.sql.*;

import java.util.*;

public class details_pay_slip {

	public static void e_details_pay_slip() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of the employee");
		int i=sc.nextInt();
		System.out.println("Enter the gross salary of the employee");
		int e=sc.nextInt();
		System.out.println("Enter the total deduction in the salary of an employee");
		int d=sc.nextInt();
		System.out.println("Enter the month of the payslip of the employee");
        String m=sc.next();
        String query="insert into payslip values(?,?,?,?,?);";
        int n=e-d;
        Connection con=emp_connection.e_connection();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1, i);
        pst.setInt(2,e);
        pst.setInt(3,d);
        pst.setInt(4,n);
        pst.setString(5,m);
        pst.executeUpdate();
     }
	public static void main()throws SQLException
	{
		e_details_pay_slip();
	}
}
