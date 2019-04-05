package sec02.exam04_Thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작스레드 이름: "+ mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("작업스레드 이름: " + threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("작업스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
