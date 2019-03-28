package exercise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel1004";
		
		String regExp = "[a-zA-Z]\\w{8,12}"; 
			//[a-zA-Z]:한개의 문자, \:구분자, \w:문자 또는 숫자(=[a-zA-Z_0-9]), {8,12}:8~12개
		boolean isMatch = Pattern.matches(regExp, id);
			//Pattern클래스의 matches 정적메소드 ("정규식","검증할문자열") 논리값 리턴
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
