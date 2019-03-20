package sec10.exam14_using_static_member;

public class Calculator {
	static double pi = 3.14159;
	String color;
//	static String color;
		
		static int plus(int x, int y) {
			return x+y;
		}
		
		static int minus(int x, int y) {
			return x-y;
		}

		void setColor(String color) {
			this.color = color;  //경고발생. 정적접근방식이 아님.
//			Calculator.color = color; //정적필드로 선언 시 사용
		}
}
