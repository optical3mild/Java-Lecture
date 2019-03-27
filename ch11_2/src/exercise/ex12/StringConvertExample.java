package exercise.ex12;

public class StringConvertExample {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		//자료형 check, 경우에 따라 결과 프린트 intanceof ?

		System.out.println("정수로 변환: " + intData1);
		System.out.println("문자열로 변환: " + strData2);
	}
}
