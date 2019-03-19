package sec06.exam02_external_class_read_adjust;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
//		System.out.println("현재속도: " + myCar.speed);
		System.out.println("현재속도: " + myCar.getSpeed()); //private로 선언된 프로퍼티를 메소드로 호출


//		myCar.speed = 60;
		myCar.setSpeed(60); //private로 선언된 프로퍼티를 메소드로 수정
//		System.out.println("수정된 속도: "+ myCar.speed);
		System.out.println("수정된 속도: "+ myCar.getSpeed());
	}

}
