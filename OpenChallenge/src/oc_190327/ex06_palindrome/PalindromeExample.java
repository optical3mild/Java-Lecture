package oc_190327.ex06_palindrome;

public class PalindromeExample {

	public static void main(String[] args) {
		//세자리수(100-999) 2중루핑하여 곱 계산
		//연산결과를 문자열로 저장
		//StringBuffer를 이용하여 문자열순서 역전(reverse())
		//문자열의 값이 동일한지 비교(equals())
		//동일하면 integer로 바꾸어 임시저장
		//루핑 두번째부터 첫번째 수와 비교, 큰 값을 변수에 저장
		//최종결과 출력
		
		String checkStr = "";
		int result = 0;
		
		for(int i=100; i<1000; i++) {
			for(int k=100; k<1000; k++) {
				int multi = i*k;
				checkStr = String.valueOf(multi);
				if(revStr(checkStr).equals(checkStr) & result < multi) {
					result = multi;
				}
			}
		}
		System.out.println("세자리수를 곱해 만들 수 있는 가장 큰 대칭수: " + result);
	}
	
	public static String revStr(String str) {
	    return (new StringBuffer(str)).reverse().toString();
	  }
}
