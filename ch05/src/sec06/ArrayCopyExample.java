package sec06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if(i != newStrArray.length-1)
				System.out.print(", ");
		}
		System.out.println();
		System.out.println();
		
		String[] utilStrArray = Arrays.copyOf(oldStrArray, 5);
		System.out.println(Arrays.toString(utilStrArray));
	}
}
