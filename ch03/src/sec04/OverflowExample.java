package sec04;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long x1 = 1000000L;
		long y1 = 1000000L;
		long z1 = x1 * y1;
		System.out.println(z1);

	}

}
