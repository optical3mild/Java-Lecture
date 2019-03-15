package sec03;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------------------------------");
				System.out.println("1.증속 |2.감속 |3.중지 |4.급가속 |5.급감속");
				System.out.println("------------------------------------------");
				System.out.print("선택: ");
			}
			keyCode = System.in.read(); //입력받는 방법 두번째타입.
			
//			if(keyCode == 49) {
////				speed++;
//				System.out.println("현재속도 = " + ++speed);
//			} else if(keyCode == 50) {
////				speed--;
//				if (speed < 0)
//					speed = 0;
//				System.out.println("현재속도 = " + --speed);
//			} else if(keyCode == 51) {
//				run = false;
//			} else if(keyCode == 52) {
////				speed += 10;
//				System.out.println("현재속도 = " + (speed+=10));
//			} else if(keyCode == 53) {
////				speed -= 10;
//				System.out.println("현재속도 = " + (speed-=10));
//			}
			if(keyCode == '1') {
				speed++;
			} else if(keyCode == '2') {
				speed--;
				if (speed < 0)
					speed = 0;
			} else if(keyCode == '3') {
				break;
			} else if(keyCode == '4') {
				speed += 10;
			} else if(keyCode == '5') {
				speed -= 10;
				if (speed < 0)
					speed = 0;
			}
			System.out.println("현재속도 = " + speed);
		}
		System.out.println("프로그램 종료");
	}
}
