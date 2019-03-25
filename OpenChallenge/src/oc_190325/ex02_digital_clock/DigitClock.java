package oc_190325.ex02_digital_clock;

public class DigitClock {

	public static void main(String[] args) {
		int[][] arrayTimeMin = new int[24][60];
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result = 0;
		
		for(int i=0; i<arrayTimeMin.length; i++) {
			if(i%10 == 3) {
				result1++;
			} else {
				for(int k=0; k<arrayTimeMin[i].length; k++) {
					if(k/10 == 3) { //30단위 --> 몫이 3인 30번대 전부
						result2++;
					} else if(k%10 == 3) { //3으로 끝나는 경우
						result3++;
					} 
				}
			}
		}
		result = result1*3600 + result2*60 + result3*60;
		
//		System.out.println(arrayTimeMin[i].length);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println("3이 표시되는 시간: " + result + "초");
	}
}
