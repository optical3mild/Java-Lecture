package Test190328.exam13;

import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}
	
	public static int[] getLottoNumber() {
		int[] resultNo = new int[6];
		
		for(int i=0; i<resultNo.length; i++) {
			resultNo[i] = (int) (Math.random()*45 + 1);
			for(int k=0; k<i; k++) {
				if(resultNo[k] == resultNo[i]) { //동일한 수가 있으면 반복횟수를 올리지 않고 다시 실행한다.
					i--;
					break;
				}
			}
		}
		return resultNo;
	}
}
