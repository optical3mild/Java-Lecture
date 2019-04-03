package exercise;

import java.util.List;
import java.util.Scanner;

public class MemApps {
	static Scanner scan = new Scanner(System.in);
	static MemberDAO mDao = new MemberDAO();
	
	//1. 회원가입
	public static void createMem() {
		System.out.println("[1.회원가입]");
		
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		System.out.print("이름> ");
		String name = scan.nextLine();
		System.out.print("생년월일> ");
		String birthday = scan.nextLine();
		System.out.print("주소> ");
		String address = scan.nextLine();
		
		mDao.insertMember(new MemberDTO(password, name, birthday, address));
	}
	
	//2. 조회 : 전체조회
	public static void searchMem() {
		System.out.println("[2.조회 : 회원현황]");
		List<MemberDTO> members = mDao.selectAll();
		for(MemberDTO member : members) {
			System.out.println(member.toString());
		}
	}
	
	//3. 수정 : id로 불러올 것.
	public static void modMemInfo() {
		System.out.print("수정할 회원 ID> ");
		int inputID = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.searchById(memberId);
	}
	
	
	
}
