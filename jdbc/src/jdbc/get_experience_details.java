package jdbc;

import java.sql.*;


import java.util.*;

public class get_experience_details {
	
	public static void e_get_experience_details() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the employee's ID");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee's career start date as yy-mm-dd");
        String s_date=sc.next();
        sc.nextLine();
		System.out.println("Enter the employee's end date as yy-mm-dd");
        String e_date=sc.next();
        sc.nextLine();
		System.out.println("Enter the employee's achievements");
        String a=sc.nextLine();
        int first1=s_date.indexOf('-');
        String s_year=s_date.substring(0,first1);
        int first2=e_date.indexOf('-');
        String e_year=e_date.substring(0,first2);
        int year1=Integer.parseInt(s_year);
        int year2=Integer.parseInt(e_year);
        int ex=year2-year1;
        String query="insert into experience values(?,?,?,?,?,?);";
        Connection con=emp_connection.e_connection();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1, i);
        pst.setString(2,s_date);
        pst.setString(3,e_date);
        pst.setInt(4,ex);
        pst.setString(5,a);
        if(ex>1&&ex<=3)
        {
             pst.setInt(6,4000);
        }
        else if(ex>3&&ex<=5)
        {
            pst.setInt(6,6000);
        }
        else if(ex>5&&ex<=7)
        {
            pst.setInt(6,8000);
        }
        else if(ex>7&&ex<=9)
        {
            pst.setInt(6,10000);
        }
        else
        {
        	pst.setInt(6, 20000);
        }
        pst.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("This ID's detail is already present");
		}
	}
	public static void main()throws SQLException
	{
		e_get_experience_details();
	}

}
