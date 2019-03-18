package sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 =0;
		for(int score: scores) {
			sum1 += score;
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add( new int[] {83,90,87} );
		System.out.println("총합: " + sum2);
		System.out.println();
		
		add2(scores); // 메소드에서 출력까지 수행 (void타입)
		
		
		

	}
	public static int add (int[] scores) {
		int sum = 0;
		for (int score: scores) {
			sum += score;
		}
		return sum;
	}
	
	public static void add2 (int[] scores) {
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum + " from add()");
		System.out.println();
	}
	
	public static int add3 (int[] scores) {
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
