package test190419.exam18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	
	public CityDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<CityDTO> selectAll() {
		String query = "select name, countrycode, district, population from city where countryCode = 'kor' order by population desc;;";
		PreparedStatement pStmt =  null;
		List<CityDTO> list = new ArrayList<CityDTO>();
		
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				CityDTO city = new CityDTO();
				city.setName(rs.getString(1));
				city.setContryCode(rs.getString(2));
				city.setDist(rs.getString(3));
				city.setPop(rs.getString(4));
				
				list.add(city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return list;
	}
	
	public void close() {
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
