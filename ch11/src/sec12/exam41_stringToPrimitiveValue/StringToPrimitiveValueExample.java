package sec12.exam41_stringToPrimitiveValue;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		int value0 = Integer.valueOf("10");
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value0: " + value0);
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
	}

}
