package Test190328.exam16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSsnExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ssn;
		
		System.out.print("주민번호 앞 7자리('000000-0')를 입력하세요> ");
		ssn = scan.nextLine();

		while(!checkExp(ssn)) {
			System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			System.out.print("주민번호 앞 7자리('000000-0')를 입력하세요> ");
			ssn = scan.nextLine();
		}
		
		scan.close();
		System.out.println(setInfo(ssn));
	}
	
	public static boolean checkExp(String input) {
		String regExp = "^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\-[1-4]$";
		boolean isMatch = Pattern.matches(regExp, input);
		if (isMatch) {
			return true;
		}
		return false;
	}
	
	public static String setInfo(String input) {
		int year = Integer.parseInt(input.substring(0, 2));
		int month = Integer.parseInt(input.substring(2, 4));
		int dayMonth = Integer.parseInt(input.substring(4, 6));
		int gender = Integer.parseInt(input.substring(7, 8));
		String result1 = null;
		String result2 = null;
		String result3 = null;
		
		
		LocalDate dateInfo = LocalDate.of(year, month, dayMonth);
		DateTimeFormatter dateInfoFormat = DateTimeFormatter.ofPattern("yy년 MM월 dd일 (E), ");
		result2 = dateInfo.format(dateInfoFormat);
		
		switch(gender) {
		case 1:
			result1 = "19"; result3 = "남자"; break;
		case 3:
			result1 = "20"; result3 = "남자"; break;
		case 2:
			result1 = "19"; result3 = "여자"; break;
		case 4:
			result1 = "20"; result3 = "여자"; break;
		}
		return result1+result2+result3;
	}
}