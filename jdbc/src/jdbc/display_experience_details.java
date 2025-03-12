package jdbc;

import java.sql.*;

import java.util.*;

public class display_experience_details {
	
	public static void e_display_experience_details() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID");
		int i=sc.nextInt();
		String query="select e.e_id,em.name,em.age,em.dept,em.dob,e.start_date,e.end_date,e.exp,e.achievements,e.bonus from experience as e inner join employee as em on e.e_id=em.id where e.e_id="+i+" order by e.exp desc;";
		Connection con=emp_connection.e_connection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("NAME : "+rs.getString(2));
			System.out.println("AGE : "+rs.getInt(3));
			System.out.println("DEPARTMENT : "+rs.getString(4));
			System.out.println("DATE OF BIRTH : "+rs.getString(5));
			System.out.println("START DATE OF JOB : "+rs.getString(6));
			System.out.println("END DATE OF JOB : "+rs.getString(7));
			System.out.println("EXPERIENCE : "+rs.getInt(8));
			System.out.println("ACHIEVEMENTS : "+rs.getString(9));
			System.out.println("BONUS : "+rs.getInt(10));
			System.out.println("_______________________________________________");

		}
	}
    public static void main()throws SQLException
    {
    	e_display_experience_details();
    }
}
