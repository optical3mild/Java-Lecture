package basic05_Exercise;

import java.util.Scanner;

public class BbsMain {
	static Scanner scan = new Scanner(System.in);
	static BbsDAO bDao = new BbsDAO();
	
	public static void main(String[] args) {
		int memberId = BbsApps.bbsLogin();
		boolean run = true; //종료 선택 전까지 while loop으로 프로그램 활성유지
		
		while(run) {
			System.out.print("|1-쓰기|2-조회|3-변경|4-삭제|5-상세조회|6-종료|> ");
			int select = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			switch(select) {
			case 1:
				BbsApps.createContents(memberId); break;
			case 2:
				BbsApps.showContentsList(); break;
			case 3:
				BbsApps.modiContents(memberId); break;
			case 4:
				BbsApps.deleteContents(memberId); break;
			case 5:
				BbsApps.searchDetail(); break;
			case 6:
				run = false; break;
			default:
				System.out.println("1-6 까지의 값만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
		bDao.close();
		scan.close();
	}

}
