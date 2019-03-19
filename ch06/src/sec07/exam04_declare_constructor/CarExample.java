package sec07.exam04_declare_constructor;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); --> 기본생성자를 호출 할 수 없다. 
									//클래스에서 정의 한다면 가능.(오버로딩)

	}

}
