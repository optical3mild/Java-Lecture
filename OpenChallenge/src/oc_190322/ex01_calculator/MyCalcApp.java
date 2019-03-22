package oc_190322.ex01_calculator;

public class MyCalcApp {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;


		MyCalc cal1 = new MyCalc();
		
//		int result1 = cal1.add(x, y);
//		System.out.println("add( "+x+" , "+ y +" ): " + result1);
		System.out.println("add( "+x+" , "+ y +" ): " + cal1.add(x, y));
		
//		int result2 = cal1.subtract(x, y);
//		System.out.println("subtract( "+x+" , "+ y +" ): " + result2);
		System.out.println("subtract( "+x+" , "+ y +" ): " + cal1.subtract(x, y));
		
//		int result3 = cal1.multiply(x, y);
//		System.out.println("multiply( "+x+" , "+ y +" ): " + result3);
		System.out.println("multiply( "+x+" , "+ y +" ): " + cal1.multiply(x, y));
	}
}
