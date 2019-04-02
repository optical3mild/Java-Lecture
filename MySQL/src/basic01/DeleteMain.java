package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMain {

	 public static void main(String[] args) {
	        Connection conn = null;
	        Statement st = null;
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");	
	            conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
	                "javauser", "javapass");	
	            
	            //MySQL update statement
	            String query = "delete from song where _id=?";
	            
	            //create the MySQL insert preparedStatement
	            PreparedStatement pStmt = conn.prepareStatement(query);
	            pStmt.setInt(1, 117); //쿼리 구문의 변수 순서에 따른 '(번호, 그 셀의 값)'
	            
	            //execute the preparedStatement
	            pStmt.executeUpdate();
	           
	            conn.close();
	        } catch (Exception ex) { //이하 수정필요.
	        	System.err.println(ex.getMessage());
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