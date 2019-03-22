package oc_190322.ex02_MyMulti;

public class MyMultiApp {

	public static void main(String[] args) {
		int[] intArray = null;
		
		//정수배열 입력 ------------------------
		int aLength = 100;
		
		intArray = new int[aLength];
		
		for(int i=2; i<=aLength; i++) {
			intArray[i-1] = -i;
		}
		//--------------------------------------
		
		MyMultiImpl calc = new MyMultiImpl();
//		int intResult;
		
//		intResult = calc.max(intArray);
		System.out.println("max(): " + calc.max(intArray)); //바로 출력할 것.
		
		System.out.println("min(): " + calc.min(intArray));
		
		System.out.println("sum(): " + calc.sum(intArray));
		
		System.out.println("avg(): " + calc.avg(intArray));
	}

}
