package BankingSystemDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class DBConn {

	
	  Connection conn = null;
	 public static Connection jdbcConnection(){
		 final String DB_URL = "jdbc:mysql://localhost/BankDB";
			final String USERNAME = "root";
			final String PASSWORD = "";
	        try{
	        	Class.forName("com.mysql.cj.jdbc.Driver"); 
	            Connection conn = DriverManager.getConnection(DB_URL,USERNAME, PASSWORD);
	            return conn;
	        }catch(Exception e){
	        	e.printStackTrace();
	            return null;
	        }
	    }
}
