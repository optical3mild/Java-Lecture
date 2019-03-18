package sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " +  avg);

	}

}
