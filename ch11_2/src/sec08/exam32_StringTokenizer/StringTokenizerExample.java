package sec08.exam32_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text =  "홍길동/이수홍?박연수";
		
		//how1:전체 토큰 수를 얻어 for문으로 루핑
//		StringTokenizer st = new StringTokenizer(text,"/");
		StringTokenizer st = new StringTokenizer(text,"/?");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2:남은 토큰 확인하고 while로 루핑
//		st = new StringTokenizer(text,"/");
		st = new StringTokenizer(text,"/?");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
