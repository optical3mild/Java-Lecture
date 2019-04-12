package oc_190410.ex01_sorting;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SortingExample {

	public static void main(String[] args) {
		String nameList = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,"
						+ "김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,"
						+ "김재성,이유덕,이재영,전경헌";

		//","로 구분하여 문자열 분리, Array에 저장.
		StringTokenizer st = new StringTokenizer(nameList,",");
		String[] names = new String[st.countTokens()];
		for(int i=0; i<names.length; i++) {
			names[i] = st.nextToken();
		}
		
		// 1) 중복을 포함하여 김씨와 이씨는 각각 몇 명 인가요?
		// 2) "이재영"이란 이름이 몇 번 중복되나요?
		int countKim = 0;
		int countLee = 0;
		int counter = 0;
		
		for(String name: names) {
			String fName = name.substring(0, 1);
			if(fName.equals("김")) countKim++;
			if(fName.equals("이")) countLee++;
			if(name.equals("이재영")) counter++;
		}
		System.out.println("1) 김씨: "+ countKim + "명, 이씨: "+ countLee + "명");
		System.out.println("2) 이재영은 " + counter+"번 반복됩니다.");
		
		
		// 3) 중복을 제거한 이름을 출력하세요.
		// 4) 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		StringBuilder sb = new StringBuilder();
		sb.append(names[0]);
		
		//자신의 앞 확인, 기록
		for(int i=1; i<names.length; i++) {
			boolean checkerF = true;
			for(int k=0; k<i; k++) { //for(int k=i-1; k>=0; k--)
				if(names[k].equals(names[i])) {
					checkerF = false;
					continue;
				}
			}
			if(checkerF) {
				sb.append(" ");
				sb.append(names[i]);
			}
		}
		System.out.println("3) 중복을 제거한 이름:");
		System.out.println(sb);
		
		StringTokenizer st2 = new StringTokenizer(sb.toString());
		String[] names2 = new String[st2.countTokens()];
		for(int i=0; i<names2.length; i++) {
			names2[i] = st2.nextToken();
		}
		
		for(int i=0; i<names2.length-1; i++) {
			for(int k=i+1; k<names2.length; k++) {
				//비교하여 조건에 맞으면 swap
				if(names2[i].compareTo(names2[k]) > 0) {
					String name = names2[i]; //임시저장
					names2[i] = names2[k];
					names2[k] = name; 
				}
			}
		}
		System.out.println("4) 중복을 제거한 이름을 오름차순으로 정렬:");
		System.out.println(Arrays.toString(names2));
	}
}
