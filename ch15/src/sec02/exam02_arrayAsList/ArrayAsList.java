package sec02.exam02_arrayAsList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍","신","감");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
//		list2.add(4);
//		list2.remove(1);
		System.out.println(list2.get(1));
		for(int value: list2) {
			System.out.println(value);
		}
	}

}
