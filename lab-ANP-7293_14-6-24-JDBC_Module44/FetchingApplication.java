package jdbc1;
import java.sql.*;
import java.util.*;
public class FetchingApplication 
{
	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","1234");
		if(conn!=null)
		{
			
			Statement test=conn.createStatement();
			ResultSet rs=test.executeQuery("select * from employee  ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		}
		else
		{
			System.out.println("Database is not connected");
		}
	}

}
