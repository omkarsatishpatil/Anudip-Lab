package jdbc1;
import java.sql.*;
import java.util.*;
public class DeleteRecordApp {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","1234");
		if(conn!=null)
		{
			Statement test=conn.createStatement();
			Scanner xyz=new Scanner(System.in);
			System.out.println("Enter employee id for delete");
			int id=xyz.nextInt();
			
			int value=test.executeUpdate("delete from employee where id="+id+"");
			if(value>0)
			{
				System.out.println("Record delete successfully........");
			}
			else
			{
				System.out.println("Some problem is there");
			}
		}
		else
		{
			System.out.println("Database not connected");
		}
	}

}
