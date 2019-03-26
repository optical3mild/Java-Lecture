package exercise.ex06;

public class BytesToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {73,32,108,111,118,101,32,121,111,117};
		String str = new String(bytes); //String 생성자를 이용, 디코딩
		System.out.println(str);
	}
}
