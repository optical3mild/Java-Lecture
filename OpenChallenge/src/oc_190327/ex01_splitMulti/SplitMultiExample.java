package oc_190327.ex01_splitMulti;

public class SplitMultiExample {

	public static void main(String[] args) {
		//10 부터 999까지 정수를 순차적으로 생성(loop). 1000은 필요없음(분해 후 결과: 0).
		//각 숫자를 100, 1000으로 나누어 몫이 0이되는 조건으로 길이 측정, for문 연산
		//각 숫자를 분해(몫과 나머지를 구하여 각 자리수 구함), 전체 곱하기
		//결과를 전역변수에 저장
		//반복
		//결과출력
		
		int sum = 0;
		
		for(int i=10; i<1000; i++) {
			if(i/100 == 0) { //10 ~ 99
				int result = (i/10) * (i%10); //10의자리 숫자 * 1의자리 숫자
				
				System.out.println(i/10 + " X " + i%10 + " = " + result);
				System.out.print(result +" + "+ sum + " = ");
				
				sum += result;
				System.out.println(sum);
				
			} else if(i/1000 == 0) { //100 ~ 999
				int result = (i/100) * ((i/10)%10) * (i%10) ; 
						//100의 자리 숫자 * 10의자리 숫자 * 1의자리 숫자
				
				System.out.println(i/100 +" X "+ (i/10)%10 +" X " + i%10 + " = " + result);
				System.out.print(result +" + "+ sum + " = ");
				
				sum += result;
				System.out.println(sum);
			} 
		}
		System.out.println("10~1000까지 각 숫자를 분해하여 곱한값의 총합: " + sum);
	}
}
