package exercise.ex05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;		//자식인 현재 클래스에 name 필드가 존재하지 않고
		super(name);			//부모 클래스에 필드가 존재. 부모클래스의 생성자를 호출하여야 한다.
		this.studentNo = studentNo;
	}
}
