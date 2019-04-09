package sec04.exam08_hashmap_2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍"), 95);
		map.put(new Student(1,"홍"), 90);
		
		System.out.println("총 Entry 수:" + map.size());
		System.out.println("value = " + map.get(new Student(1,"홍")));
	}

}
