package exam11;

public class Summation {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=1000; i++) {
			if(i%7==0) {
				sum += i;
			}
		}
		System.out.println("1~1000사이 존재하는 7의 배수 총합: " + sum);
	}
}
