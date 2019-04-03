package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	
	//동적로딩 
	//: 불특정 클래스 로딩을 위해 Class클래스의 forName함수를 이용하여
	//	해당 클래스를 메모리로 로드 (어떤 객체를 생성해서 처리를 해야될지 모르는 경우)
	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");	//[1]동적로딩
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public EaglesDTO selectOne(int backNo) {
		String query = "select * from eagles where Back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO player = new EaglesDTO();
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) { //DB에서 data수신
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPos(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setPhand(rs.getString(5));
				player.setHhand(rs.getString(6));
				player.setAnnIncome(rs.getInt(7));
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
		String query = "insert into eagles values(?,?,?,?,?,?,?);";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPos());
			pStmt.setString(4, player.getHs());
			pStmt.setString(5, player.getPhand());
			pStmt.setString(6, player.getHhand());
			pStmt.setInt(7, player.getAnnIncome());
			
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

	public void updatePlayer(EaglesDTO player) {
		String query = "update eagles set name=?, position=?,high_school=?,pitch_hand=?,hit_hand=?,annual_income=? where back_no=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, player.getName());
			pStmt.setString(2, player.getPos());
			pStmt.setString(3, player.getHs());
			pStmt.setString(4, player.getPhand());
			pStmt.setString(5, player.getHhand());
			pStmt.setInt(6, player.getAnnIncome());
			pStmt.setInt(7, player.getBackNo());
			
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

	public void deletePlayer(EaglesDTO player) { //매개변수: DTO로 받아도 되고, 정수값으로 받아도 됨. (int num) 
		String query = "delete from eagles where back_no=?;";
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

	
	//개선된 메소드 : 쿼리에 따라 선택하도록 중복코드 수정 ---------------------------
	public List<EaglesDTO> selectCondition(String query) { //selectAll변경
		PreparedStatement pStmt = null;
		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
		
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) { //DB에서 data수신
				EaglesDTO player = new EaglesDTO();
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPos(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setPhand(rs.getString(5));
				player.setHhand(rs.getString(6));
				player.setAnnIncome(rs.getInt(7));
				playerList.add(player);
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
		return playerList;
	}
	
	public List<EaglesDTO> selectPlayersByPosition(String position) {
		String sql = "select * from Eagles where Position like '"+position + "';";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectPlayersBySalary(int salary) {
		String sql = "select * from Eagles where annual_income >= "+salary + ";";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectAll() {
		String sql = "select * from Eagles;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	//---------------------------------------------------------------------------------
	
	
	//close()
	public void close() {
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public List<EaglesDTO> selectAll() {
//		String query = "select * from eagles;";
//		PreparedStatement pStmt = null;
//		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
//		
//		try {
//			pStmt = conn.prepareStatement(query);
//			ResultSet rs = pStmt.executeQuery();
//			
//			while(rs.next()) { //DB에서 data수신
//				EaglesDTO player = new EaglesDTO();
//				player.setBackNo(rs.getInt(1));
//				player.setName(rs.getString(2));
//				player.setPos(rs.getString(3));
//				player.setHs(rs.getString(4));
//				player.setPhand(rs.getString(5));
//				player.setHhand(rs.getString(6));
//				player.setAnnIncome(rs.getInt(7));
//				playerList.add(player);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pStmt != null && !pStmt.isClosed())
//					pStmt.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//		return playerList;
//	}

	
//	public List<EaglesDTO> selectPlayers() { //연봉 1억원 이상 명단 연습
//		String query = "select * from eagles where annual_income >= 10000;";
//		PreparedStatement pStmt = null;
//		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
//		
//		try {
//			pStmt = conn.prepareStatement(query);
//			ResultSet rs = pStmt.executeQuery();
//			
//			while(rs.next()) { //DB에서 data수신
//				EaglesDTO player = new EaglesDTO();
//				player.setBackNo(rs.getInt(1));
//				player.setName(rs.getString(2));
//				player.setPos(rs.getString(3));
//				player.setHs(rs.getString(4));
//				player.setPhand(rs.getString(5));
//				player.setHhand(rs.getString(6));
//				player.setAnnIncome(rs.getInt(7));
//				playerList.add(player);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pStmt != null && !pStmt.isClosed())
//					pStmt.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//		return playerList;
//	}

	
//	public List<EaglesDTO> selectPlayers2() { //외야수 명단 연습
//		String query = "select * from eagles where position like '외야수';";
//		PreparedStatement pStmt = null;
//		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
//		
//		try {
//			pStmt = conn.prepareStatement(query);
//			ResultSet rs = pStmt.executeQuery();
//			
//			while(rs.next()) { //DB에서 data수신
//				EaglesDTO player = new EaglesDTO();
//				player.setBackNo(rs.getInt(1));
//				player.setName(rs.getString(2));
//				player.setPos(rs.getString(3));
//				player.setHs(rs.getString(4));
//				player.setPhand(rs.getString(5));
//				player.setHhand(rs.getString(6));
//				player.setAnnIncome(rs.getInt(7));
//				playerList.add(player);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pStmt != null && !pStmt.isClosed())
//					pStmt.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//		return playerList;
//	}

}
