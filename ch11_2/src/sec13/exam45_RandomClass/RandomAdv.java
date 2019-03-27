package sec13.exam45_RandomClass;

import java.util.Arrays;
import java.util.Random;

public class RandomAdv {

	public static void main(String[] args) { //천만번 돌려 몇번 당첨되나 확인
		
		for(int k=0; k<1000000000; k++) {
		
			int[] selectNumber = new int[6];
			Random random = new Random(3);
//			System.out.print("선택번호: ");
			for(int i=0; i<6; i++) {
				selectNumber[i] = random.nextInt(45) + 1;
//				System.out.print(selectNumber[i] + " ");
			}
//			System.out.println();
			
			int[] winningNumber = new int[6];
			random = new Random(5);
//			System.out.print("당첨번호: ");
			for(int i=0; i<6; i++) {
				winningNumber[i] = random.nextInt(45) + 1;
//				System.out.print(winningNumber[i] + " ");
			}
//			System.out.println();
			
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.print("당첨여부: ");
			if(result) {
				System.out.println("당첨");
			} else {
				System.out.println("꽝");
			}
		}
	}
}