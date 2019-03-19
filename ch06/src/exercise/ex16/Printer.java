package exercise.ex16;

public class Printer {
	
	void println(int integer){
		System.out.println("정수형 출력 " + integer);
	}
	
	void println(boolean bool){
		System.out.println("논리값 출력 " + bool);
	}
	
	void println(double doub){
		System.out.println("실수형 출력 " + doub);
	}
	
	void println(String str){
		System.out.println("문자열 출력 " + str);
	}
}
