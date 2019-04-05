package sec02.exam03_BeepPrintExample3;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//how1: thread를 상속받은 객체를 구현, 실행
//		Thread thread = new BeepThread();
		
		//how2: 익명구현객체
		Thread thread = new Thread() { //how1의 BeepThread()를 클래스 내용으로 대체
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {};
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {};
		}

	}

}
