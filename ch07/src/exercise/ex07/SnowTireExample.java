package exercise.ex07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		//override된 자식클래스의 run()메소드가 두번 동작하여
		//"스노우 타이어가 굴러갑니다"라는 문장이 두번 출력됩니다.
	}
}
