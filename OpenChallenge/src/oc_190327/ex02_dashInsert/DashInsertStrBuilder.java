package oc_190327.ex02_dashInsert;

public class DashInsertStrBuilder {
	
	public static String dashInsertSb(String str) {
		int[] intArray = new int[str.length()]; //문자열 길이만큼의 크기를 가지는 배열생성
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<=str.length()-1; i++) {
			if(i==str.length()-1) {						//문자열의 마지막 문자는 연산없이 문자열에 추가
				sb.append(intArray[i]);
				break;
			}
			
			intArray[i] = str.charAt(i)-'0';			//char에서 '0'을 연산하면 int로 자동변환이 된다.
			intArray[i+1] = str.charAt(i+1)-'0';
			
			if(intArray[i]%2 == 1 && intArray[i+1]%2 == 1) {
				sb.append(intArray[i]);
				sb.append("-");
			} else if (intArray[i]%2 == 0 && intArray[i+1]%2 == 0) {
				sb.append(intArray[i]);
				sb.append("*");
			} else {
				sb.append(intArray[i]);
			}
		}
		return sb.toString();
	}
}
