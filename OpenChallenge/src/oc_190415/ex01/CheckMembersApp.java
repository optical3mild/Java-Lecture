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
		StringTokenizer st = new StringTokenizer(participantsString,",");
		
		
		for(String person: st) {
			participantsList.add(person);
			
		}
	}
	
	public static String findPerson(List<String> participants, List<String> completioners) {
		for(String person: completioners) {
			if (!participants.remove(person))
				System.out.println("리스트에서 엘리먼트 제거에 문제가 발생");;
		}
		return participants.get(0);
	}
}
