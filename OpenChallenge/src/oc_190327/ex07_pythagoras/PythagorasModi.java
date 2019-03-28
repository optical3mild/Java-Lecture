package oc_190327.ex07_pythagoras;

public class PythagorasModi {

	public static void main(String[] args) {
		//주어진 조건: a<b<c, a+b>c, a+b+c=1000, 가능한 조합은 한가지.
		
		//1. 조건1 -> a<b : b=a+1부터 loop
		//2. 조건3 -> a가 0에 가까워질때, b는 c의 크기와 비슷해지므로 b<500
		//3. 3의 내용으로, c<500(+ a는 1보다 큰 정수) : c의 최대값 = 499
		//4. 조건1,3 : a의 최대값 = 332
		//5. a가 최소값을 가질 때 주어진 조건으로 b의 최대값 = 498
		//6. a가 증가하면 b는 감소 : b의 loop는 최대값에서 감소시키면서 진행
		
		//2중 for loop
		//순차적으로 곱하여 조건 만족 시 출력한다
		
		int a, b, c;
		
		for(a=1; a<=332; a++) {	
			for(b=498; b>a; b--) {
				c = 1000-(a+b);				//c는 a와 b로 정의할 수 있음 : loop 필요없음
				if(a*a + b*b == c*c) {
					System.out.println("합이 1000인 피타고라스 수는 " +a+" "+b+" "+c+" 입니다");
					break;					//가능한 조합은 한가지 이므로, 발견 시 loop을 종료.
				}
			}
		}
	}
}
