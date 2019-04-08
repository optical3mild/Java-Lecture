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

	static int dartResult(ScoreBoard[] dart) {
		int score = 0;
		for (int i=0; i<3; i++) {
			switch (dart[i].area) {
			case 'S':
				dart[i].score = dart[i].number;
				break;
			case 'D':
				dart[i].score = dart[i].number * dart[i].number;
				break;
			case 'T':
				dart[i].score = dart[i].number * dart[i].number * dart[i].number;
			}
		}
		for (int i=0; i<3; i++) {
			if (dart[i].optionStar) {
				dart[i].score *= 2;
				if (i != 0) {
					dart[i-1].score *= 2;
				}
			}
			if (dart[i].optionAcha)
				dart[i].score *= -1;
		}
		score = dart[0].score + dart[1].score + dart[2].score;
		return score;
	}
	
	static ScoreBoard[] parseDart(String str) { //
		ScoreBoard[] dart = new ScoreBoard[3]; //3회의 게임
		StringTokenizer st = null;
		String s; 
//		String number = null;
		int index = 0; 
		int len = str.length();
		
		for (int i=0; i<3; i++) {
			dart[i] = new ScoreBoard();	//게임이 기록될 객체생성
			dart[i].optionStar = false;	//*옵션 값 초기화
			dart[i].optionAcha = false;	//#옵션 값 초기화
			s = str.substring(index);	//점수 자릿수에 따라 입력된 게임문자열의 나눌 곳을 선택
			System.out.println(s);
			
			st = new StringTokenizer(s, "SDT");
			dart[i].number = Integer.parseInt(st.nextToken());
			index += (dart[i].number == 10) ? 2 : 1;
			dart[i].area = str.charAt(index); 
			index++;
			if (index < len) {
				if (str.charAt(index) == '*')
					dart[i].optionStar = true;
				if (str.charAt(index) == '#')
					dart[i].optionAcha = true;
				if (dart[i].optionStar || dart[i].optionAcha)
					index++;
			}
			//System.out.println(i + dart[i].toString());
		}
		return dart;
	}
}