package retry.oc_190322.ex02;

public class MyMultiApp {

	public static void main(String[] args) {
		int[] intArray = null;
		
		//정수배열 입력 ------------------------ //음수_정수 같이 생성하는 방법?
		int aLength = 100;
		
		intArray = new int[aLength];
		
		for(int i=2; i<=aLength; i++) {
			intArray[i-1] = -i;
		}
		//--------------------------------------
		
		MyMultiImpl calc = new MyMultiImpl();
		int intResult;
		
		intResult = calc.max(intArray);
		System.out.println("max(): " + intResult);
		
		intResult = calc.min(intArray);
		System.out.println("min(): " + intResult);
		
		intResult = calc.sum(intArray);
		System.out.println("sum(): " + intResult);
		
		double doubleResult = calc.avg(intArray);
		System.out.println("avg(): " + doubleResult);
	}

}
