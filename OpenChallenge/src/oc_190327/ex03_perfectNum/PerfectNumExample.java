package oc_190327.ex03_perfectNum;

import java.util.Scanner;

public class PerfectNumExample {

	public static void main(String[] args) {
		//입력을 받고
		//1부터 받은 수까지 아래 연산을 반복한다 (2중for문)
		//내측 루핑에서 외측 루핑의 index를 1부터 %연산으로 나눈다
		//결과가 0인 수를 더한다 
		//모두 더한 수를 index와 비교하여 동일하면 출력한다

		Scanner scan = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요> ");
		int input = Integer.parseInt(scan.nextLine());
		scan.close();
		System.out.println();
		
		System.out.println("["+input+"이하의 완전수]");
		for(int i=1; i<=input; i++) {
			int sum = 0;
			for(int k=1; k<i; k++) { //'자신 이외의 약수들의 합' = 자신 : 자기 자신으로 나누지 않는다.
				if(i%k == 0) {
					sum += k;
				}
			}
			if(i == sum) {
				System.out.println(i);
			}
		}
		
	}
}
