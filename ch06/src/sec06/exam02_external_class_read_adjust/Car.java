package sec06.exam02_external_class_read_adjust;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
//	int speed;
	
	private int speed; //private 선언의 경우, 아래의 두 메소드로 접근가능함

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
