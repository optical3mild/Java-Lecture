package basic05_Exercise;

import java.util.List;
import java.util.Scanner;

public class MemberApps {
	static Scanner scan = new Scanner(System.in);
	static MemberDAO mDao = new MemberDAO();
	
	//1. 회원가입
	static void createMember() {
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
		System.out.println();
	}
	
	//2. 조회 : 전체조회
	static void showMembers() {
		System.out.println("[2.회원현황 조회]");
		List<MemberDTO> members = mDao.selectAll();
		for(MemberDTO member : members) {
			System.out.println(member.toString());
		}
	}
	
	//3. 수정 : id로 불러올 것.
	static void modiMemberInfo() {
		System.out.println("[3.회원정보 수정]");
		System.out.print("ID> ");
		int inputId = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.selectMemberById(inputId); //Id와 일치하는 객체생성
		
		System.out.print("패스워드(" + member.getPassword() + ")> ");
		String password = scan.nextLine();
		if (password.length() != 0) { //입력값 없을경우, 변경전 정보가 그대로 입력됨.
			member.setPassword(password);
		}
		
		System.out.print("이름(" + member.getName() + ")> ");
		String name = scan.nextLine();
		if (name.length() != 0) {
			member.setName(name);
		}
		
		System.out.print("생년월일(" + member.getBirthday() + ")> ");
		String birthday = scan.nextLine();
		if (birthday.length() != 0) {
			member.setBirthday(birthday);
		}
		
		System.out.print("주소(" + member.getAddress() + ")> ");
		String address = scan.nextLine();
		if (address.length() != 0) {
			member.setAddress(address);
		}
		mDao.updateMember(member);
	}
	
	//4. 삭제
	static void deleteMember() {
		System.out.println("[4.회원정보 삭제]");
		System.out.print("ID> ");
		int inputId = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.selectMemberById(inputId); //Id와 일치하는 객체생성
		mDao.deleteMember(member);
	}
	
	//5. 검색
	static void searchMembers() {
		System.out.println("[5.회원정보 검색]");
		System.out.print("이름> ");
		String inputName = scan.nextLine();
		List<MemberDTO> members = mDao.selectMembersByName(inputName);
		for(MemberDTO currentMem : members) {
			System.out.println(currentMem.toString());
		}
	}
	
	//6. 로그인
	static int memberLogin() {
		int result = -1;
		System.out.println("[6.로그인]");
		System.out.print("ID> ");
		int inputId = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		
		MemberDTO mDto = mDao.selectMemberById(inputId);
		
		if (inputId != mDto.getId()) {
			System.out.println("ID가 존재하지 않습니다.");
			System.exit(result);								//시스템 종료
		}
		if (!password.equals(mDto.getPassword())) {
			System.out.println("패스워드가 틀렸습니다.");
			System.exit(result);
		} else {
			System.out.println("로그인 되었습니다.");
			result = mDto.getId();
		}
		return result;
	}
}
