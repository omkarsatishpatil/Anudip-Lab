package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

interface CRUDOperations 
{
    void create(int id,String firstName, String lastName, int salary ,String designation) throws SQLException;
    void read() throws SQLException;
    void update(int id, String firstName, String lastName, int salary, String designation) throws SQLException;
    void delete(int id) throws SQLException;
}


class JDBCCrudOperations implements CRUDOperations 
{
    private Connection connection;
    private java.sql.Statement statement;
    private ResultSet resultSet;

    public JDBCCrudOperations() throws SQLException
    {
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","1234");
    }

    @Override
    public void create(int id,String firstName, String lastName, int salary, String designation ) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "INSERT INTO employee (id,first_name, last_name, salary, designation) VALUES ('"+id+"','" + firstName + "', '" + lastName + "', " + salary + ",'"+ designation +"')";
        statement.executeUpdate(sql);
        System.out.println("Data inserted successfully!");
    }

    @Override
    public void read() throws SQLException 
    {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) 
        {
            System.out.println(resultSet.getInt("id") + ", "+ resultSet.getString("first_name") + ", "+ resultSet.getString("last_name") + ", "+ resultSet.getInt("salary")+ "," + resultSet.getString("designation"));
        }
    }

    @Override
    public void update(int id, String firstName, String lastName, int salary, String designation) throws SQLException 
    {
        statement = connection.createStatement();
        String sql = "UPDATE employee SET first_name='" + firstName + "', last_name='" + lastName + "', salary=" + salary + " , designation='" + designation +"'WHERE id=" + id;
        statement.executeUpdate(sql);
        System.out.println("Data updated successfully!");
    }

    @Override
    public void delete(int id) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "DELETE FROM employee WHERE id=" + id;
        statement.executeUpdate(sql);
        System.out.println("Data deleted successfully!");
    }

    // Close connection
    public void closeConnection() throws SQLException
    {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

	
}

public class CURDOperation 
{
	public static void main(String[] args) 
	{
		 try {
	            JDBCCrudOperations jdbcCrud = new JDBCCrudOperations();

	            Scanner xyz = new Scanner(System.in);
	            System.out.println("Select operation:");
	            System.out.println("1. Create");
	            System.out.println("2. Read");
	            System.out.println("3. Update");
	            System.out.println("4. Delete");
	            System.out.print("Enter your choice: ");
	            int operation = xyz.nextInt();

	            switch (operation) 
	            {
	                case 1:
	                	System.out.print("Enter id: ");
	                    int id = xyz.nextInt();
	                    System.out.print("Enter first name: ");
	                    String firstName = xyz.next();
	                    System.out.print("Enter last name: ");
	                    String lastName = xyz.next();
	                    System.out.print("Enter salary: ");
	                    int salary = xyz.nextInt();
	                    System.out.print("Enter first designation: ");
	                    String designation = xyz.next();
	                    jdbcCrud.create(id,firstName, lastName, salary, designation);
	                    break;
	                case 2:
	                    jdbcCrud.read();
	                    break;
	                case 3:
	                    System.out.print("Enter user id to update: ");
	                    int updateId = xyz.nextInt();
	                    System.out.print("Enter updated first name: ");
	                    String updatedFirstName = xyz.next();
	                    System.out.print("Enter updated last name: ");
	                    String updatedLastName = xyz.next();
	                    System.out.print("Enter updated salary: ");
	                    int updatedsalary = xyz.nextInt();
	                    System.out.print("Enter updated designation: ");
	                    String updateddesignation = xyz.next();
	                    jdbcCrud.update(updateId, updatedFirstName, updatedLastName, updatedsalary, updateddesignation);
	                    break;
	                case 4:
	                    
	                    System.out.print("Enter user id to delete: ");
	                    int deleteId = xyz.nextInt();
	                    jdbcCrud.delete(deleteId);
	                    break;
	                default:
	                    System.out.println("Invalid operation!");
	            }

	            jdbcCrud.closeConnection();
	        }
		    catch (SQLException e) 
		    {
	            e.printStackTrace();
	        }
		


	}

}
