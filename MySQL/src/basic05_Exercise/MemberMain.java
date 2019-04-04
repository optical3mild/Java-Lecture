package basic05_Exercise;

import java.util.Scanner;

public class MemberMain {

	public static int main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mDao = new MemberDAO();
		boolean run = true; //종료 선택 전까지 while loop으로 프로그램 활성유지
		int memberId = -1;
		
		while(run) {
			System.out.println("|1-가입|2-조회|3-변경|4-삭제|5-검색|6-로그인|7-종료|");
			System.out.print("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			switch(select) {
			case 1:
				MemberApps.createMember(); break;
			case 2:
				MemberApps.showMembers(); break;
			case 3:
				MemberApps.modiMemberInfo(); break;
			case 4:
				MemberApps.deleteMember(); MemberApps.showMembers(); break;
			case 5:
				MemberApps.searchMembers(); break;
			case 6:
				memberId = MemberApps.memberLogin(); break; //로그인 수행 후 memberId값 반환
			case 7:
				run = false; break;
			default:
				System.out.println("1-7 까지의 값만 입력하세요.");
			}
			mDao.close();
			System.out.println("프로그램 종료");
		}
		scan.close();
		return memberId;
	}

}
