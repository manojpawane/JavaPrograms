import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class TransactionProcessing 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");	
		 String url="jdbc:mysql://localhost:3306/my1stdatabase";
		 Connection connection=(Connection)DriverManager.getConnection(url,"root","root123"); 
		 try
		 {
		
		
		Statement statement = (Statement) connection.createStatement();

   connection.setAutoCommit(false);
   
   String SQL = "INSERT INTO employee  " +
                "VALUES (10,'Rita', 22000)";
   statement.executeUpdate(SQL);  
   
   String SQL2 = "INSERTED INTO employee  " +
                "VALUES (15,'Sita',55000)";
   statement.executeUpdate(SQL2);
   
   connection.commit();
}catch(SQLException se)
{
 
   connection.rollback();
}
		
		
		 }

		
		
	}


