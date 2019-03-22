package sec05.exam12_casting;

import sec05.exam11_method_polymorphism.*;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 달립니다");
		
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
	
}
