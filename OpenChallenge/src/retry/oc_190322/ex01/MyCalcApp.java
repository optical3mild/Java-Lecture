package retry.oc_190322.ex01;

import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) {
//		int x = 10;
//		int y = 5;

//more : 수식을 String으로 입력받아 분해, 각각의 메소드로 전달하여 결과 출력
		
		Scanner scan = new Scanner(System.in);

//		System.out.println("연산자를 선택하세요>");
//		String operator = scan.nextLine();
//		System.out.println("첫번째 피연산자를 입력하세요>");
//		String operator = Integer.parseInt(scan.nextLine());
//		System.out.println("두번째 피연산자를 입력하세요>");
//		String operator = Integer.parseInt(scan.nextLine());
		
		System.out.println("수식을 입력하세요>");
		String calLine = scan.nextLine();
		
		String[] inputParts = new String[calLine.length()]; //수식의 문자열 길이 크기의 배열생성
		
		for(int i=0; i<calLine.length(); i++) {
			inputParts[i] = calLine.charAt(i);
			switch(inputParts[i]) {
			case "+":
			case "-":
			case "*":
				
				break;
			default:
			}
		}
		
		for (int i = 0; i < calLine.length(); i++) {
		      System.out.println(calLine.charAt(i));
		    }
		
		
		switch(operator) {
		
		case "+":
			
			break;
		
		}
		
		MyCalc cal1 = new MyCalc();
		
		int result1 = cal1.add(x, y);
		System.out.println("add( "+x+" , "+ y +" ): " + result1);
		
		int result2 = cal1.subtract(x, y);
		System.out.println("subtract( "+x+" , "+ y +" ): " + result2);
		
		int result3 = cal1.multiply(x, y);
		System.out.println("multiply( "+x+" , "+ y +" ): " + result3);
	}
}
