package sec07.exam06_overload_constructor;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
	}
	
	Car(String model) {
//		this.model = model;
		this(model, null, 0); //아래의 생성자 참조
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 0); //아래의 생성자 참조
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	
	
//	Car(String company, String model, String color, int maxSpeed) { //이클립스 source> generate constructor
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}

	@Override
	public String toString() { //이클립스 source> toString
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

//	public String toString(int num) { //수정가능
//		return "Car" + num + "[company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
//	}
}
