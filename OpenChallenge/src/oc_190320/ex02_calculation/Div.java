package oc_190320.ex02_calculation;

public class Div {
	//필드
	private int a;
	private int b;
	
	//생성자 : default - 컴파일 시 자동생성. 명시하지 않아도 됨.
	public Div() {}
	
	//메소드
	public void setValue(int a, int b) {	//매개변수 값을 받아 필드 값 초기화
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {	//연산수행
		return a/b;
	}
}
