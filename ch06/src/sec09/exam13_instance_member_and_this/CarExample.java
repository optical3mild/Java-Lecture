package sec09.exam13_instance_member_and_this;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("밴츠");
		
		myCar.run();
		yourCar.run();
		
		System.out.println(myCar.toString());
		System.out.println(yourCar.toString());
	}
}
