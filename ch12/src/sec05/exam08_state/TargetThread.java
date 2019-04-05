package sec05.exam08_state;

public class TargetThread extends Thread {
	public void run() {
		for (long i=0; i<10000000000L; i++) {}
		//1.5초간 일시정지
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		for (long i=0; i<10000000000L; i++) {}
	}
}

