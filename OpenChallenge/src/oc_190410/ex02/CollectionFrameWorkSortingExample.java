package oc_190410.ex02;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class CollectionFrameWorkSortingExample {

	public static void main(String[] args) {
		String nameList = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,"
				+ "김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,"
				+ "김재성,이유덕,이재영,전경헌";
		
		//","로 구분하여 문자열 분리
		StringTokenizer st = new StringTokenizer(nameList,",");
	
		TreeSet<String> names = new TreeSet<String>();
		int countKim = 0;
		int countLee = 0;
		int counter = 0;
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String fName = name.substring(0, 1);
			if(fName.equals("김")) countKim++;
			if(fName.equals("이")) countLee++;
			if(name.equals("이재영")) counter++;
			names.add(name);
		}
		
		// 1) 중복을 포함하여 김씨와 이씨는 각각 몇 명 인가요?
		// 2) "이재영"이란 이름이 몇 번 중복되나요?
		System.out.println("1) 김씨: "+ countKim + "명, 이씨: "+ countLee + "명");
		System.out.println("2) 이재영은 " + counter+"번 반복됩니다.");
		
		// 3) 중복을 제거한 이름을 출력하세요.
		// 4) 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		System.out.println("3)4) 중복을 제거하고 오름차순으로 정렬:");
		System.out.println(names);
		
	}

}
