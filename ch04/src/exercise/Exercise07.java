package exercise;

import java.util.Scanner;

public class Exercise07 {

	private static Scanner scanner;

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			
			int scan;
			int scan2;
			try {
				scan = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				continue;
			}
		
			switch (scan) {
			case 1:
				System.out.print("예금액> ");
				try {
					scan2 = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					scan2 = 0;
				}
				balance += scan2;
				break;
				
			case 2:
				System.out.print("출금액> ");
				try {
					scan2 = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					scan2 = 0;
				}
				balance -= scan2;
				break;
			
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			
			case 4:
				break;
	
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

/*	public static String blockingNaN(int value) {
//		String userInput  = "NaN";
		String setMode = new String();
		double val = Double.valueOf(value);
		if(Double.isNaN(val)) {
			setMode = "5";
		} else {
			setMode = value;
		}
		return setMode;
	}*/
}
