package sec16.exam52_DateTimeCreate;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeCreate {

	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜: " + targetDate + "\n");
		
		LocalTime currTime = LocalTime.now();
		System.out.println("목표 날짜: " + currDate);

		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 날짜: " + targetTime + "\n");
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠르다");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("isntant1이 늦다");
		} else {
			System.out.println("동일하다");
		}
		System.out.println("차이(nanos): "+instant1.until(instant2, ChronoUnit.NANOS));
	}

}
