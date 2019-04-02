package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class UpdateMain {

	 public static void main(String[] args) {
	        Connection conn = null;
//	        Statement st = null;
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");	
	            conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
	                "javauser", "javapass");	
	            
	            //MySQL update statement
	            String query = "update song set lyrics=? where _id=?";
	            
	            //create the MySQL insert preparedStatement
	            PreparedStatement pStmt = conn.prepareStatement(query);
	            pStmt.setString(1, "왜 예쁜 날 두고 가시나...");
	            pStmt.setInt(2, 117);
	            
	            //execute the preparedStatement
	            pStmt.executeUpdate();
	           
	            conn.close();
	        } catch (Exception ex) { //이하 수정필요.
	        	ex.printStackTrace();
	        } finally {
	            try {
//	            	st.close();
                    conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
	}