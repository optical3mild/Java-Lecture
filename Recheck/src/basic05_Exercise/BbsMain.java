package basic05_Exercise;

import java.util.Scanner;

public class BbsMain {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//로그인: MemberMain.main(args)
		int memberId = MemberMain.main(args);
		
		if(memberId == -1) {
			//시스템 종료
		}
		bbsMenu();
		
		
		//로그인 성공 시 bbsMenu()작동
	}
	
	
	private static void bbsMenu() {
		//MemberDAO mDao = new MemberDAO(); //DB access 객체 생성
		boolean run = true; //종료 선택 전까지 while loop으로 프로그램 활성유지
		
		while(run) {
			System.out.println("|1-쓰기|2-조회|3-변경|4-삭제|5-상세조회|6-종료|");
			System.out.print("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			switch(select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				run = false; break;
			default:
				System.out.println("1-6 까지의 값만 입력하세요.");
			}
			//mDao.close();
			System.out.println("프로그램 종료");
		}
		scan.close();
	}

}
