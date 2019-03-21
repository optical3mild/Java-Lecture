package sec05.exam05_final_method;

public class Car {
	public int speed;
	
	public void speedUp() { speed += 1;}
	
	public final void stop() {
		System.out.println("멈춤");
		speed = 0;
	}

}
