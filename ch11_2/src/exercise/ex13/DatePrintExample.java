package exercise.ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 mm분");
		System.out.println(sdf.format(now));
		
		//Date객체 생성
		//SimpleDateFormat 객체생성 ("포맷형식")
		//SimpleDateFormat의 메소드 호출: '변수명.format(Date객체의 변수명)'
	}
}
