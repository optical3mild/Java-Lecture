package exercise.ex15;

public class MemberService {
	private String id = "hong";
	private String password = "12345";
	
	boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println("로그아웃되었습니다.");
		} else {
			System.out.println("실패하였습니다. ID를 확인하세요.");
		}
	}
	
	
}
