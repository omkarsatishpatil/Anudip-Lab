package jdbc1;
import java.sql.*;

public class UpdateData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","1234");

		 Statement stmt = con.createStatement();
		 
		 stmt.executeUpdate("UPDATE employee SET name='kal' WHERE empid=3" );
		 System.out.println("Details Updated");
	      con.close();


	}

}
