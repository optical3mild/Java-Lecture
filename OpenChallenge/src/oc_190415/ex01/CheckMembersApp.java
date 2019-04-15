package oc_190415.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CheckMembersApp {

	public static void main(String[] args) {
		String participantsString = "이유덕,이재영,권종표,박민호,강상희";
		String completionersString = "이유덕,이재영,권종표,박민호";
		
		List<String> participantsList = new ArrayList<String>();
		List<String> completionersList = new ArrayList<String>();
		
		//String을 잘라 리스트에 저장
		StringTokenizer st = new StringTokenizer(participantsString,",");
		while(st.hasMoreTokens()) {
			participantsList.add(st.nextToken().trim());
		}
		
		st = new StringTokenizer(completionersString,",");
		while(st.hasMoreTokens()) {
			completionersList.add(st.nextToken().trim());
		}
		
		System.out.println(findPerson(participantsList,completionersList));
	}
	
	public static String findPerson(List<String> participants, List<String> completioners) {
		for(String person: completioners) { //참여자 목록에서 완주자 삭제
			if (!participants.remove(person))	//조건부여와 실행문 동시에 작성됨.
				System.out.println("리스트에서 엘리먼트 제거에 문제가 발생");;
		}
		return participants.get(0);		//남은 참여자는 리스트의 첫번째 인덱스를 참조하여 추출할 수 있음
	}
}
