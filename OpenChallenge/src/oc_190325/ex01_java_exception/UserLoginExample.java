package oc_190325.ex01_java_exception;

import java.util.Scanner;

public class UserLoginExample {

	public static void main(String[] args) {
		// 사용자의 입력을 받고
		// Id, pw 확인 메소드의 결과값을 돌려받아 전부 true면 로그인 성공
		// 예외발생 시 메시지 출력
		// retry : 실행 프로그램을 간략히 수정할것
		boolean matchId = false;
		boolean matchPw = false;
		String inputId;
		String inputPw;
		
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("ID를 입력하세요: ");
			inputId = scan.nextLine();
			System.out.print("Password를 입력하세요: ");
			inputPw = scan.nextLine();
			
			UserData userData = new UserData();
			matchId = userData.matchId(inputId);
			matchPw = userData.matchPw(inputPw);
		} catch (InvalidLoginIdException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("알수없는 오류발생");
			e.printStackTrace();
		} finally {
			if(matchId & matchPw) {
				System.out.println("로그인 성공");
			}
		}
		scan.close();
	}
}
