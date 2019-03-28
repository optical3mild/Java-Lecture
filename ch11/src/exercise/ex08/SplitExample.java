package exercise.ex08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 : split()메소드 이용
		String[] newStr1 =  str.split(",");
		for(int i=0; i<newStr1.length; i++) {
			System.out.println(newStr1[i]+ " ");
		}
		System.out.println();
		
		
		//방법2 : stringTokenizer 이용
		StringTokenizer newSt = new StringTokenizer(str, ",");
		while(newSt.hasMoreTokens()) {
			String token = newSt.nextToken();
			System.out.println(token);
		}
		// new StringTokenizer(str, ",") : 객체생성, 매개값=전체문자열, 구분자=","
		// newSt.hasMoreTokens() 
		//	: newSt에 토큰(부분문자열)이 남아있는지 여부를 논리값으로 반환, 남은동안 실행문 루핑
		// newSt.nextToken(): newSt의 토큰을 하나씩꺼내 참조 변수에 대입(주소저장)
		// 참조변수를 매개로 분리된 부분 문자열 출력
		// 출력은 System.out.println(newSt.nextToken());로는 불가. 예외발생.
	}
}
