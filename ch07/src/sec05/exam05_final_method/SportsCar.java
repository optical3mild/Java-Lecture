package sec05.exam05_final_method;

public class SportsCar extends Car{
	@Override
	public void speedUp() { speed += 18;}
	
//	@Override  --> override불가
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
