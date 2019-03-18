package sec05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String name = null;
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		System.out.println(name.length()); 
		//null의 length 없음. 출력과 에러는 콘솔에 순서없이 섞여서 나온다
		//		Exception in thread "main" java.lang.NullPointerException
		//		at sec05.StringEqualsExample.main(StringEqualsExample.java:32)
	}

}
