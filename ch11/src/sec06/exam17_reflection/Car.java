package sec06.exam17_reflection;

public class Car {
	private String tire = "flatTire";

	public Car() {}
	
	public Car(String tire) {
		this.tire = tire;
	}

	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}
}
