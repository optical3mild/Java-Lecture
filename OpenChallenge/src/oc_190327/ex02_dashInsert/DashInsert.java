package oc_190327.ex02_dashInsert;

public class DashInsert {
	//문자열을 한자리씩 나눈다 (String 클래스의 charAt()이용)
	//두개씩 연산, 비교하여 변환된 문자열을 반환, result에 추가 저장한다
	//%2 연산 --> 1:홀수 0:짝수
	//2번연속 --> 홀수사이 '-' / 짝수사이'*'
	//결과값을 출력한다.
	
	public static String dashInsert(String str) {
		int[] intArray = new int[str.length()]; //문자열 길이만큼의 크기를 가지는 배열생성
		String flashStr1;
		String flashStr2;
		String result = "";
		
		for(int i=0; i<=str.length()-1; i++) {
			if(i==str.length()-1) {						//문자열의 마지막 문자는 연산없이 문자열에 추가
				result += String.valueOf(intArray[i]);
				break;
			}
			flashStr1 = String.valueOf(str.charAt(i)); //인덱스 i에 위치한 문자를 문자열로 변환하여 저장(parseInt: char->int 불가)
			intArray[i] = Integer.parseInt(flashStr1); //저장한 문자열을 정수로 변환, 배열에 순서대로 저장
			
			flashStr2 = String.valueOf(str.charAt(i+1));
			intArray[i+1] = Integer.parseInt(flashStr2);
			
			if(intArray[i]%2 == 1 && intArray[i+1]%2 == 1) {
				result += flashStr1 + "-";
			} else if (intArray[i]%2 == 0 && intArray[i+1]%2 == 0) {
				result += flashStr1 + "*";
			} else {
				result += flashStr1;
			}
		}
		return result;
	}
}
