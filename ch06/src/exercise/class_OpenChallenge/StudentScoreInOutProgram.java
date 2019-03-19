package exercise.class_OpenChallenge;

import java.util.Scanner;

public class StudentScoreInOutProgram {

	private static Scanner scan;

	public static void main(String[] args) {
		
		StudentScore stuScore = new StudentScore(null, 0, 0, 0); //객체
		
		boolean run = true;
		
		scan = new Scanner(System.in); //"Scanner Scan = ..." : 로컬변수를 전역으로 변경(이클립스)
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.성명 | 2.점수입력 | 3.분석 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			
			switch(selectNo) {
			
			case 1:
				System.out.print("성명> ");
				stuScore.setName(scan.nextLine());
				break;
			
			case 2:
				System.out.print("수학> ");
				stuScore.setMath(Integer.parseInt(scan.nextLine()));
				System.out.print("영어> ");
				stuScore.setEng(Integer.parseInt(scan.nextLine()));
				System.out.print("과학> ");
				stuScore.setSci(Integer.parseInt(scan.nextLine()));
				break;
				
			case 3:
				stuScore.average(); //호출 x시 초기값만 출력됨.
				System.out.println(stuScore.toString());
				break;
				
			case 4:
				run = false;
				break;	
			}
		}
	}
}
