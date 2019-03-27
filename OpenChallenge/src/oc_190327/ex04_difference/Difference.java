package oc_190327.ex04_difference;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		//자연수N 입력을 받는다
		//1부터 자연수N까지 합의 제곱을 구하고
		//제곱의 합을 구한다
		//차이를 출력한다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요> ");
		int input = Integer.parseInt(scan.nextLine());
		scan.close();
		System.out.println();
		
		int addSum = 0;
		int sqSum = 0;
		
		for(int i=0; i<=input; i++) {
			addSum += i; 	//1부터 N까지 합
			sqSum += i*i;	//1부터 N까지 제곱의 합	
		}
		
		int result = addSum*addSum - sqSum;
		System.out.println("1부터 " + input + "의 '합의 제곱 - 제곱의 합' = " + result);
	}
}
