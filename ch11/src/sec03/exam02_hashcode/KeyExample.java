package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(2), "홍길");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		value = hashMap.get(new Key(2));
		System.out.println(value);
	}
}
