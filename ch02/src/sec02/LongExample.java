package sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;				//정수범위내에서는 syntax에러가 나지 않으나 L은 반드시 붙일것.
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일 에러
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
