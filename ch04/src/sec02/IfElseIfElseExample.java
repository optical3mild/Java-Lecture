package sec02;

import java.util.Scanner; //선언 - 외부에서 만들어놓은 라이브러리를 사용하겠다

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요>");
//		int score = scan.nextInt();
//		String Line = scan.nextLine();
//		int score = Integer.parseInt(Line);
		int score = Integer.parseInt(scan.nextLine());
				
		//int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100-90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score>=80){
			System.out.println("점수가 89-80입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score>=70){
			System.out.println("점수가 79-70입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		scan.close();
	}

}
