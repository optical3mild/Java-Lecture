package oc_190327.ex05_caesarCipher;

public class CaesarCipher {

	public static String encryptToCaesar(String str, int n) {
		//문자열과 n값 입력받음
		//문자열 분해 (charAt())
		//분해문자열 + n 을 char값으로 저장
		//StringBuilder를 이용하여 순차적으로 문자열 추가
		//결과 리턴
		
		StringBuilder sb = new StringBuilder();
		int[] intArray = new int[str.length()]; //문자열 길이만큼의 크기를 가지는 배열생성
		
		for(int i=0; i<str.length(); i++) {
			intArray[i] = str.charAt(i) + n;
			sb.append((char)intArray[i]);
		}
		return sb.toString();
	}
}
