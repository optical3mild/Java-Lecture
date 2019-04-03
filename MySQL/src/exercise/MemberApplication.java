package exercise;

import java.util.List;
import java.util.Scanner;

public class MemberApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mDao = new MemberDAO();
		boolean run = true; //종료 선택 전까지 while loop으로 프로그램 활성유지
		
		while(run) {
			System.out.println("|1-가입|2-조회|3-변경|4-삭제|5-검색|6-로그인|7-종료|");
			System.out.print("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			switch(select) {
			case 1:
				MemApps.createMem(); break;
			case 2:
				MemApps.searchMem(); break;
			case 3:
				MemApps ; break;
			case 4:
				MemApps ; break;
			case 5:
				MemApps ; break;
			case 6:
				MemApps ; break;
			case 7:
				run = false; break;
			default:
				System.out.println("1-7 까지의 값만 입력하세요.");
			}
			mDao.close();
			System.out.println("프로그램 종료");
			
		}
		
		switch(input) {
		case 1: //회원가입
	
		case 2: //조회: 최근가입 순서순 -- id자동생성 = 순서대로 --> DAO에서 desc
			List<MemberDTO> members = mDao.selectAll();
			for(MemberDTO member : members) {
				System.out.println(member.toString());
			}
			break;
		
		case 3: //변경
			System.out.println("id를 입력하세요> ");
			int inputId = scan.nextInt();
			MemberDTO member = mDao.selectOne(inputId);
			System.out.println(member.toString());
			System.out.println();
			System.out.println("[2."+inputId+" 정보수정]");
			System.out.print("패스워드> ");
			member.setPassword(scan.nextLine());
			System.out.print("이름> ");
			member.setName(scan.nextLine());
			System.out.print("생년월일> ");
			member.setBirthday(scan.nextLine());
			System.out.print("주소> ");
			member.setAddress(scan.nextLine());
			System.out.println();
			mDao.updateMember(member);
			System.out.println("수정되었습니다.");
			member = mDao.selectOne(inputId);
			System.out.println(member.toString());
			break;
			
		case 4: //삭제
			System.out.println("id를 입력하세요> ");
			inputId = scan.nextInt();
			member = mDao.selectOne(inputId);
			System.out.println(member.toString());
			System.out.println();
		
			mDao.deleteMember(member);					//삭제
//			members = mDao.selectAll(); 			//전체검색으로 확인
//			for(MemberDTO current : members) {
//				System.out.println(current.toString());
//			}
			break;
		
		case 5: //검색 : 이름으로
			System.out.print("이름> ");
			String inputName = scan.nextLine();
			members = mDao.selectMemberByName(inputName);
			for(MemberDTO currentMem : members) {
				System.out.println(currentMem.toString());
			}
		}
		scan.close();

	}

}
