package sec04.exam07_synchronized_sync;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//how1
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName()+": " +this.memory);
//	}
	
	//how2
	public void setMemory(int memory) {
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": " +this.memory);
		}
	}
}
