package jdbc;

import java.util.*;

import java.sql.*;

public class display_details_pay_slip 
{
    public static void e_display_pay_slip() throws SQLException
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of the employee");
		int i=sc.nextInt();
		System.out.println("If you want to display every month payslip then press 1");
		System.out.println("If you want to display a particular month payslip then press 2");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        {
        	String query="select p.id,e.name,p.gross_salary,p.deductions,p.netsalary,p.salarymonth from employee as e inner join payslip as p on p.id=e.id where e.id="+i+";";
        	Connection con=emp_connection.e_connection();
        	Statement st=con.createStatement();
        	ResultSet rs=st.executeQuery(query);
        	while(rs.next())
        	{
        		System.out.println("ID :"+i);
        		System.out.println("NAME :"+rs.getString(2));
        		System.out.println("GROSS SALARY :"+rs.getInt(3));
        		System.out.println("DEDUCTIONS :"+rs.getInt(4));
        		System.out.println("NET SALARY :"+rs.getInt(5));
        		System.out.println("MONTH :"+rs.getString(6));
        		System.out.println("-----------------------------------------");
                
        	}
        	break;
        }
        case 2:
        {
        	System.out.println("Enter the month of the payslip to be displayed");
        	String m=sc.next();
        	String query="select p.id,e.name,p.gross_salary,p.deductions,p.netsalary,p.salarymonth from employee as e inner join payslip as p on p.id=e.id where e.id="+i+" and p.salarymonth="+"\""+m+"\""+";";
        	Connection con=emp_connection.e_connection();
        	Statement st=con.createStatement();
        	ResultSet rs=st.executeQuery(query);
        	int f=0;
        	while(rs.next())
        	{
        		f=1;
        		System.out.println("ID :"+i);
        		System.out.println("NAME :"+rs.getString(2));
        		System.out.println("GROSS SALARY :"+rs.getInt(3));
        		System.out.println("DEDUCTIONS :"+rs.getInt(4));
        		System.out.println("NET SALARY :"+rs.getInt(5));
        		System.out.println("MONTH :"+rs.getString(6));
        		System.out.println("-----------------------------------------");
        	}
        	if(f==0)
        	{
        		System.out.println("No such month's payslip is available");  
        		System.out.println("-----------------------------------------");

        	}
        	break;
        }
        }
    }
    public static void main()throws SQLException
    {
    	e_display_pay_slip();
    }
}
