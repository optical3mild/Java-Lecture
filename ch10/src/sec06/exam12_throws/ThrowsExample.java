package sec06.exam12_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();						//선언한 곳이 아닌 호출한곳에서 예외처리
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	public static void findClass() throws ClassNotFoundException { //원래 여기서 예외발생
		Class clazz = Class.forName("java.lang.String2");
	}

}
