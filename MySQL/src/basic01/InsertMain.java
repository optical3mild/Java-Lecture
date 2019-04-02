package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {

	 public static void main(String[] args) {
	        Connection conn = null;
	        Statement st = null;
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");	
	            conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
	                "javauser", "javapass");	
	            
	            //MySQL insert statement
	            String query = "insert into song (title, lyrics) values (?,?);";
	            
	            //create the MySQL insert preparedStatement
	            PreparedStatement pStmt = conn.prepareStatement(query);
	            pStmt.setString(1, "가시나");
	            pStmt.setString(2, "날두고.....");
	            
	            //execute the preparedStatement
	            pStmt.executeUpdate();
	           
	            conn.close();
	        } catch (Exception ex) { //이하 수정필요.
	        	System.err.println(ex.getMessage());
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (st != null)
	                    st.close();
	            } catch (SQLException se2) { }
	            try {
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
	}
