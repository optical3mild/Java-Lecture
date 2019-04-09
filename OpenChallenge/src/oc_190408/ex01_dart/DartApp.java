package oc_190408.ex01_dart;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DartApp {
	public static void main(String[] args) {
		// 1. 객체에 필드 값 입력
		// 2. option 영역에 따라 점수 계산
		Scanner scan = new Scanner(System.in);
		System.out.print("Dart 게임 입력> ");
		String game = scan.nextLine();
		System.out.println("획득한 점수 = " + dartResult(parseDart(game)));
		scan.close();
	}

	static int dartResult(ScoreBoard[] dart) { //parseDart() 메소드에서 정리된 게임정보를 매개변수로 받아 점수계산
		int score = 0;
		for (int i=0; i<3; i++) {					//3회 게임에서 받은 점수에 영역(area필드)값을 적용하여 계산하는 loop
			switch (dart[i].area) {
			case 'S':								//single의 경우 점수가 그대로 반영됨
				dart[i].score = dart[i].number;
				break;
			case 'D':								//double의 경우 받은 점수의 제곱으로 반영								
				dart[i].score = dart[i].number * dart[i].number;
				break;
			case 'T':								//triple의 경우 받은 점수의 세제곱으로 반영
				dart[i].score = dart[i].number * dart[i].number * dart[i].number;
			}
		}
		for (int i=0; i<3; i++) {					//영역값(area)이 반영된 각 회차의 점수에 옵션을 적용하여 계산하는 loop
			if (dart[i].optionStar) {				//*이 있다면 반영된 점수를 두배로 적용
				dart[i].score *= 2;
				if (i != 0) {
					dart[i-1].score *= 2;			//*이 있다면 이전 회차의 점수도 두배로 적용
				}
			}
			if (dart[i].optionAcha)					//#이 있다면 해당 회차의 점수는 -값으로 적용됨
				dart[i].score *= -1;
		}
		score = dart[0].score + dart[1].score + dart[2].score;	//최종적으로 1,2,3회차의 점수를 총합하여 리턴
		return score;
	}
	
	static ScoreBoard[] parseDart(String str) {	//게임 점수 정보를 String 매개변수로 받아 객체의 각 필드에 정리
		ScoreBoard[] dart = new ScoreBoard[3];	//3회의 게임 -> 매 게임을 배열에 저장
		StringTokenizer st = null;
		String s;
		int index = 0; 							//for문 내의 substring()메소드에 이용, 게임 점수 정보를 분할하는 기준점 저장
		int len = str.length();
		
		for (int i=0; i<3; i++) {
			dart[i] = new ScoreBoard();			//게임 정보를 저장할 객체 생성
			dart[i].optionStar = false;			//객체내의 게임 옵션값 초기화
			dart[i].optionAcha = false;
			s = str.substring(index);			//index값 부터 시작하여 index값 이후의 게임 점수 정보를 분할하여 String 참조변수에 저장
			//System.out.println(s);			//중간확인용도
			
			st = new StringTokenizer(s, "SDT");	//index값 이후부터 분할저장된 게임 정보를 구분자(S/D/T)를 기준으로 다시 분할(=token)
			dart[i].number = Integer.parseInt(st.nextToken()); //저장되어 있는 토큰 중 첫번째를 정수로 변환, 객체i번째 배열의 number필드에 대입
			index += (dart[i].number == 10) ? 2 : 1;	//점수의 범위는 1-10까지 이므로, 점수가 10일때 index 값을 2증가(두자리 뒤부터 분할하도록)
			dart[i].area = str.charAt(index); 			//증가된 index값이 가리키는 위치는 S/D/T 이므로 이를 이용하여 S/D/T정보를 객체의 area필드에 저장
			index++;							//점수와 영역값을 추출하였으므로, 그 이후의 옵션값과 다음회차부터 검사하기 위해 index값을 증가
			if (index < len) {					//점수기록의 문자열 길이보다 index값이 클 수 없고, 그에따른 예외를 방지하기 위한 조건을 설정
				if (str.charAt(index) == '*')	//영역 이후 옵션값 확인, 옵션값이 존재한다면 true를 반환
					dart[i].optionStar = true;
				if (str.charAt(index) == '#')
					dart[i].optionAcha = true;
				if (dart[i].optionStar || dart[i].optionAcha) //옵션값이 존재한다면 index값을 증가하여 문자열 내 다음회차 정보의 기준점을 조정
					index++;
			}
			//System.out.println(i + dart[i].toString()); //중간 확인용도
		}
		return dart;	//루프 종료 후, 저장된 객체 주소배열을 반환
	}
}