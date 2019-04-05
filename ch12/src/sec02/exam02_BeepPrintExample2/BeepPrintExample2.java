package sec02.exam02_BeepPrintExample2;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);

		//how2 : 익명구현객체
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {};
				}
			}
		});
		
		//how3 : 람다식 표현
		
		
		//공통부분---------------------------------------------------
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {};
		}
		
	}
}
