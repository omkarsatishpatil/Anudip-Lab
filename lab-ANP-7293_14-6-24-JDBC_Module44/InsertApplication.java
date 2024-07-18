package jdbc1;

import java.sql.*;
import java.util.*;

public class InsertApplication {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		 * DriverManager.registerDriver(d); Connection
		 * conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root",
		 * "1234");
		 */
		
        Class.forName("com.mysql.cj.jdbc.Driver");//step 1. Register the driver
		
		//step 2 establish connection to mysql
		//JDBC api which are the interfaces and classes ara availbale to establish a connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","1234");

		/*if(conn!=null)
		{*/
			/*Scanner xyz=new Scanner(System.in);
			System.out.println("how many entries do you want to insert");
			int size=xyz.nextInt();
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter employees  id, name,designation,salary");
				//xyz.nextLine();
				int id=xyz.nextInt();
				String name=xyz.nextLine();
				String designation=xyz.nextLine();			
				int salary=xyz.nextInt();*/
				Statement test=con.createStatement();
				test.executeUpdate("insert into employee values(5, 'sita', 'QA', 200000)");
				System.out.println("EMployee add hua");

				/*int val=test.executeUpdate("insert into employee values('"+id+"','"+name+"','"+designation+"','"+salary+"')");
				if(val>0)
				{
					System.out.println("Data insert successfully.......");
				}
				else
				{
					System.out.println("Some problem is there");
				}
			}	
		}
		else
		{
			System.out.println("Database not connected........");
		}
*/
	}

}

