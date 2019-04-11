package sec03.exam05_system_in;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception{
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금조회");
		System.out.println("2. 예금출금");
		System.out.println("3. 예금입금");
		System.out.println("4. 종료하기");
		System.out.println("메뉴를 선택하세요");
		
		InputStream is = System.in;
		
		char inputChar = (char) is.read();
		switch(inputChar) {
		case '1':
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("에금출금을 선택하셨습니다.");
			break;
		case '3':
			System.out.println("에금입금을 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료하기를 선택하셨습니다.");
			break;
		}
	}
}
