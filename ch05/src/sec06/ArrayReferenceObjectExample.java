package sec06;

import java.util.Arrays;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		System.out.println(Arrays.toString(strArray));
		
		System.out.println( strArray[0] == strArray[1]);		//같은 곳을 가리킴.
		System.out.println( strArray[0] == strArray[2]);		//다른 곳을 가리킴.
		System.out.println( strArray[0].equals(strArray[2]));	//값(문자열)은 같음.
	}
}
