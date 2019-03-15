package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		int eye1 = 0;
		int eye2 = 0;
		int sum = 0;
		String state = new String();
		
		while((eye1+eye2) != 5) {
			eye1 = (int)(Math.random()*6)+1;
			eye2 = (int)(Math.random()*6)+1;
			sum = eye1 + eye2;
			System.out.println("주사위는 (" + eye1 +" , " + eye2 +")");
			if(sum == 5) {  // == :비교  = :대입
				state = "종료";
			} else {
				state = "다시";
			}
			System.out.println("합계 " + sum + " 이므로 " + state + "합니다.");
		}
	}
}
