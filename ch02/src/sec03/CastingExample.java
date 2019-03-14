package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intValue =  44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		intValue = 103029898;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
	}

}
