package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class emp_connection {
	 private static final String url="jdbc:mysql://localhost:3306/employee_db";
	 private static final String user="root";
	 private static final String password="$Nv13092005";
	 public static Connection e_connection() throws SQLException
	 {
		 return DriverManager.getConnection(url,user,password);
	 }
}
	