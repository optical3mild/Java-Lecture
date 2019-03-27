package oc_190327.ex07_pythagoras;

public class PythagorasExample {

	public static void main(String[] args) {
		//3중 for loop
		//순차적으로 곱하여 3개의 조건 만족 시 출력한다
		//a와 b의 순서만 바뀐 조합의 중복 출력을 막기위해 a>b의 조건을 추가
		
		int a, b, c;
		
		for(a=1; a<1000; a++) {
			for(b=1; b<1000; b++) {
				for(c=1; c<1000; c++) {
					if((a*a + b*b == c*c) && (a+b+c == 1000) && (a>b)) {
						System.out.println("합이 1000인 피타고라스 수는 " +a+" "+b+" "+c+" 입니다");
					}
				}
			}
		}
	}

}
