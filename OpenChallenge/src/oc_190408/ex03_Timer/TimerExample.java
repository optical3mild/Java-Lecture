package oc_190408.ex03_Timer;

import java.util.Scanner;

public class TimerExample {

	public static void main(String[] args) {
		//기준 퇴근시간
		CurrentTime closeTime = new CurrentTime();
		closeTime.setInputHour(18);
		closeTime.setInputMinute(30);
		closeTime.setInputSecond(0);
		
		//case1 현재시간 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 시간을 입력하세요(HH:mm:ss) > ");
		
		CurrentTime inputTime;
		inputTime = new CurrentTime();
		try {
			String input = scan.nextLine();
			String[] time = input.split(":");
			
			inputTime.setInputHour(Integer.parseInt(time[0]));
			inputTime.setInputMinute(Integer.parseInt(time[1]));
			inputTime.setInputSecond(Integer.parseInt(time[2]));
			
			closeTime.calTimeWithSec(inputTime);
		} catch (NumberFormatException e) {
			//case2 입력값 없음 --> 현재시간 기준 출력
			closeTime.calTimeWithSec();
		}
		
		scan.close();
	}

}
