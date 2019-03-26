package sec05.exam13_Time;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println(sum);
		System.out.println("소요시간: " + (time2-time1) + "ns");
	}

}
