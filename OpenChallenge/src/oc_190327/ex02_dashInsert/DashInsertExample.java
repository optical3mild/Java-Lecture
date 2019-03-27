package oc_190327.ex02_dashInsert;

import java.util.StringTokenizer;

public class DashInsertExample {

	public static void main(String[] args) {
		String str =  "4546793";
		
		System.out.println(dashInsert(str));
	}
	
	//문자열을 한자리씩 나눈다 (String 클래스의 charAt()이용)
	//두개씩 연산, 비교하여 변환된 문자열을 반환, StringBuilder의 버퍼에 저장한다.
	//%2 연산 --> 1:홀수 0:짝수
	//2번연속 --> 홀수사이 '-' / 짝수사이'*'
	//결과값을 출력한다.
	public static String dashInsert(String str) {
		int strLength = str.length();
		int[] intArray = new int[strLength];
		String result = null;
//		StringBuilder result = new StringBuilder();
		for(int i=0; i<str.length()-1; i++) {
			
			intArray[i] = Integer.parseInt(str.charAt(i));
			intArray[i+1] = str.charAt(i+1);
			if(intArray[i]%2 == 1 && intArray[i+1]%2 == 1) {
				result += intArray[i] + "-";
			} else if (intArray[i]%2 == 0 && intArray[i+1]%2 == 0) {
				result += intArray[i] + "*";
			}
			
		}
		
		return result;
	}
}
