package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATS");
		
		int size = list.size();
		System.out.println("총 객체수: "+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i =0;i<list.size();i++) { 
			// --> for(String lst; list) {} : 반복가능한 객체들에 adv for loop 사용
			String str = list.get(i);
			System.out.println(i+": " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATS");
		
		for(int i =0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+": " + str);
		}
		
		
	}

}
