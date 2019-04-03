package basic04_Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	
	//[1]동적로딩 
	//: 불특정 클래스 로딩을 위해 Class클래스의 forName함수를 이용하여
	//	해당 클래스를 메모리로 로드 (어떤 객체를 생성해서 처리를 해야될지 모르는 경우)
	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");	//[1]동적로딩
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//Insert
	public void insertMember(MemberDTO member) { //sql구문 : 모든 column에 입력하지 않을 시, 입력할 column을 명시하여야 한다.
		String query = "insert into member(password, name, birthday, address) values(?,?,?,?);";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			
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

	//update
	public void updateMember(MemberDTO member) {
		String query = "update member set password=?, name=?, birthday=?, address=? where id=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			pStmt.setInt(5, member.getId());
			
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
	
	//delete
	public void deleteMember(MemberDTO member) { //매개변수: DTO로 받아도 되고, 정수값으로 받아도 됨. (int num) 
		String query = "delete from member where id=?;";
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, member.getId());
			
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
	
	//Create Table
	public void createTable() { //col항목을 받아 생성하는 메소드로 수정할 것.
		String query = "create table if not exists member (" + 
						"id int(6) unsigned not null auto_increment," + 
						"password varchar(10) not null," + 
						"name varchar(10) not null," + 
						"birthday date not null default 0," + 
						"address varchar(50)," + 
						"primary key(id)" + 
						") auto_increment=10001 default charset=utf8;";
		
		PreparedStatement pStmt = null;
		
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.execute();
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
		
	
	//select * from member where id
	public MemberDTO selectMemberById(int id) {
		String query = "select * from member where id=?;";
		MemberDTO member = selectOne(query);
		return member;
	}
	
	//select *
	public List<MemberDTO> selectAll() {
		String query = "select * from member order by id desc;";
		List<MemberDTO> memberList = selectCondition(query);
		return memberList;
	}

	//select * from member where name like ...
	public List<MemberDTO> selectMembersByName(String name) {
		String query = "select * from member where name like '"+ name + "' order by id asc;";
		List<MemberDTO> memberList = selectCondition(query);
		return memberList;
	}

	
//---[Selection]---------------------------------------------------------	
	//쿼리문에 따라 한종류만 선택
	public MemberDTO selectOne(String query) {
		MemberDTO member = new MemberDTO();
    	PreparedStatement pStmt = null;
    	
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				member.setId(rs.getInt(1));
				member.setPassword(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
    	return member;
    }
			
	//쿼리문에 따른 리스트 반환
	public List<MemberDTO> selectCondition(String query) { //selectAll변경
		PreparedStatement pStmt = null;
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) { //DB에서 data수신
				MemberDTO member = new MemberDTO();
				member.setId(rs.getInt(1));
				member.setPassword(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
				memberList.add(member);
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
		return memberList;
	}
}
