package exercise;

import java.util.Scanner;

public class Exercise09 {

	private static Scanner scan; //전역변수 선언

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum]; //정수 배열
			} else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]: " + scores[i]);
				}
			} else if(selectNo == 4) {
				double avg = 0;
				int max = 0;
				for(int i=0; i<studentNum; i++) {
					avg += (double) scores[i] / studentNum;
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			} 
		}
		System.out.println("프로그램 종료");
	}
}
