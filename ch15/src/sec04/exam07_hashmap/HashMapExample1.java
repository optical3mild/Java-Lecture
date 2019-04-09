package sec04.exam07_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		//Map컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신", 85);
		map.put("홍", 90);
		map.put("동", 80);
		map.put("신", 95);
		System.out.println("총 Entry수: " + map.size());
		
		//객체 찾기
		System.out.println("\t홍 : "+map.get("홍"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("\t" + key+ " : " + value);
//		}
		
		for(String key:keySet)
				System.out.println("\t" + key+ " : " + map.get(key));
		
		System.out.println();
		
		//객체 삭제
		map.remove("홍");
		System.out.println("총 Entry수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//		while(entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println("\t" + key+ " : " + value);
//		}
		
		for(Map.Entry<String, Integer> entry: entrySet)
			System.out.println("\t" + entry+ " : " + entry.getValue());	
		System.out.println();
		
		
		//객체 전체삭제
		map.clear();
		System.out.println("총 Entry수: " + map.size());
	}

}
