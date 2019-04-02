package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
            				
            st = conn.createStatement();
            String sql = "select id, DATE_FORMAT(datetime, '%Y-%m-%d %r') FROM Date_table;";
           //MySQL에서 함수를 이용, 시간포맷을 변경하여 수신
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String dTime = rs.getString(2);
                System.out.printf("%8d %-20s\t\n", id, dTime);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                    st.close();
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
