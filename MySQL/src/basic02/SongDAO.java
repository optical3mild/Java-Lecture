package basic02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	
	//동적로딩 
	//: 불특정 클래스 로딩을 위해 Class클래스의 forName함수를 이용하여
	//	해당 클래스를 메모리로 로드 (어떤 객체를 생성해서 처리를 해야될지 모르는 경우)
	public SongDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");	//[1]동적로딩
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void insertSong(SongDTO song) {
		String query = "insert into song (title, lyrics) values(?,?);";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());
			
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
	
	public SongDTO selectOne(int id) {
		String query = "select * from song where _id=?;";
		PreparedStatement pStmt = null;
		SongDTO song = new SongDTO();
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {	//DB에서 data수신
				song.setId(rs.getInt("_id"));	//== rs.getInt(1);
				song.setTitle(rs.getString("title")); // == rs.getString(2);
				song.setLyrics(rs.getString("lyrics")); // == rs.getString(3);
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
		return song;
	}
	
	public void updateSong(SongDTO song) {
		String query = "update song set title=?, lyrics=? where _id=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());
			pStmt.setInt(3, song.getId());
			
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
	
	public void deleteSong(SongDTO song) { //update를 복사하여 쿼리문을 바꾸고, set을 매개변수에 맞게 조정.
		String query = "delete from song where _id=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, song.getId());
			
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
	
	//2일차
	public List<SongDTO> selectAll() {
		String query = "select * from song;";
		PreparedStatement pStmt =  null;
		List<SongDTO> list = new ArrayList<SongDTO>();
		
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				SongDTO song = new SongDTO();
				song.setId(rs.getInt("_id"));	//rs.getInt(1);
				song.setTitle(rs.getString("title")); //rs.getString(2);
				song.setLyrics(rs.getString("lyrics")); //rs.getString(3);
				
				list.add(song);
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
