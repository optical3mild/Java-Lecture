package test190419.exam17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	
	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public EaglesDTO selectOne(int backNo) {
		String query = "select * from eagles_copy where Back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO player = new EaglesDTO();
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPos(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setPhand(rs.getString(5));
				player.setHhand(rs.getString(6));
				player.setBirthday(rs.getInt(7));
				player.setAnnIncome(rs.getString(8));
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
		return player;
	}
	
	public void insertPlayer(EaglesDTO player) {
		String query = "insert into eagles_copy values(?,?,?,?,?,?,?,?);";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPos());
			pStmt.setString(4, player.getHs());
			pStmt.setString(5, player.getPhand());
			pStmt.setString(6, player.getHhand());
			pStmt.setInt(7, player.getBirthday());
			pStmt.setString(8, player.getAnnIncome());
			
			pStmt.executeUpdate();
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
	}
	
	public void deletePlayer(EaglesDTO player) {
		String query = "delete from eagles_copy where back_no=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			
			pStmt.executeUpdate();
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
	}
	
	//close()
	public void close() {
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
