package oc_190408.ex03_timer;

import java.util.Calendar;

public class CurrentTime {
	int inputHour;
	int inputMinute;
	int inputSecond;
	
	public CurrentTime() {}
	
	public CurrentTime(int inputHour, int inputMinute, int inputSecond) {
		this.inputHour = inputHour;
		this.inputMinute = inputMinute;
		this.inputSecond = inputSecond;
	}

	public int getInputHour() {
		return inputHour;
	}

	public void setInputHour(int inputHour) {
		this.inputHour = inputHour;
	}

	public int getInputMinute() {
		return inputMinute;
	}

	public void setInputMinute(int inputMinute) {
		this.inputMinute = inputMinute;
	}

	public int getInputSecond() {
		return inputSecond;
	}

	public void setInputSecond(int inputSecond) {
		this.inputSecond = inputSecond;
	}
	
	public void calTimeWithSec() {
		Calendar cal = Calendar.getInstance();
		int nowHour = cal.get(Calendar.HOUR_OF_DAY);
		int nowMin = cal.get(Calendar.MINUTE);
		int nowSec = cal.get(Calendar.SECOND);
		
		calTimeWithSec(new CurrentTime(nowHour, nowMin, nowSec));
	}
	
	public void calTimeWithSec(CurrentTime time) {
		int sum1 = this.getInputHour()*60*60 + this.getInputMinute()*60 + this.getInputSecond();
		int sum2 = time.getInputHour()*60*60 + time.getInputMinute()*60 + time.getInputSecond();
		
		int[] result = new int[3];
		int diff = sum1 - sum2;
		result[2] = diff % 60;
		diff = diff /= 60;
		result[1] = diff % 60;
		result[0] = diff / 60;
		
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		System.out.println("남은 시간은 " + result[0]+"시간 "+result[1]+"분 "+result[2]+"초 입니다.");
	}
	
	
}
