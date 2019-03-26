package exercise.ex07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바"); //매개값으로 주어진 문자열이 시작되는 
										 //인덱스를 리턴. 없으면 -1리턴.
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "Java"); //매개값1을 매개값2로 치환한 문자열 저장 
			System.out.println("-->" + str);
		}
	}

}
