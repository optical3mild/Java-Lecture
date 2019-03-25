package oc_190325.ex04_count;

import java.util.Arrays;

public class Count {

	public static void main(String[] args) {
		int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //각 숫자에 해당하는 index위치에 갯수 카운트
		
		for (int i=1; i<=9; i++) { //한자리수 숫자(1~9) --> 일괄적으로 check
			counts[i]++;
		}
		for (int i=10; i<=99; i++) {	//두자리수 숫자(10~99)
			int firstDigit = i / 10;	//10으로 나눈 몫 == 십의자리 숫자
			int secondDigit = i % 10;	//10으로 나눈 나머지 == 일의자리 숫자
			counts[firstDigit]++; counts[secondDigit]++; //각 index에 합산
		}
		for (int i=100; i<=999; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10; //10으로 나눔 -> 두자리수로 변환.
			int thirdDigit = i % 10;
			counts[firstDigit]++; counts[secondDigit]++; counts[thirdDigit]++;
		}
		counts[1]++; counts[0] += 3; 	// 1000은 따로 합산
		
		System.out.println(Arrays.toString(counts));
	}
}