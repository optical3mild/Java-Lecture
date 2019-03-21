package sec07.exam13_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환성공");
		} else {
			System.out.println("method1 - Child로 변환실패");
		}
	}
	
	public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환성공");
	}
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); //예외발생

	}

}
