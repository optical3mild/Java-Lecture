package exercise.ex09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//how1
		Set<String> set = map.keySet();				//keySet얻기
		Iterator<String> iterator = set.iterator();	//반복자: 전체 객체를 대상으로 한번씩 반복해서 객체를 가져옴
		while(iterator.hasNext()) {					//hasNext(): 객체가 있으면 true리턴
			String key = iterator.next();			//next(): 컬렉션에서 하나의 객체를 가져옴
			Integer value = map.get(key);			//컬렉션의 value값 추출 (int형에 저장하여도 됨.)
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
			totalScore += value;
		}
		double avg = (double) totalScore / map.size();
		System.out.println("평균점수 : " + avg);
		System.out.println("최고점수 : " + name+", "+maxScore);
		System.out.println();
		
		//how2
		totalScore = 0;						//how2를 수행하기 위해 how1결과 초기화
		maxScore = 0;						//how2를 수행하기 위해 how1결과 초기화
		Set<String> set2 = map.keySet();	//keySet얻기
		for(String str: set2) {				//저장된 객체 수 만큼 루핑
			int value = map.get(str);		//Integer --> int로 컬렉션의 value값 추출
			if(maxScore < value) {
				maxScore = value;
				name = str;
			}
			totalScore += value;
		}
		double avg2 = (double) totalScore / map.size();
		double avgR = Math.round(avg2*10.0)/10.0; //Math.round(): 실수의 소수점 첫번째 자리를 반올림, 정수로 리턴
//		double avgR2 = Math.round((double)totalScore / map.size()*10.0)/10.0;
		System.out.println("평균점수 : " + avg2);
		System.out.println("평균점수(소수점 반올림) : " + avgR);
//		System.out.println("평균점수(소수점 반올림) : " + avgR2);
		System.out.println("최고점수 : " + name+", "+maxScore);
	}
}
