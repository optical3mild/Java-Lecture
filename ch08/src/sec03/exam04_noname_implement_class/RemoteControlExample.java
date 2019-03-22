package sec03.exam04_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("추상메소드 turnOn() 구현");
			}
			public void turnOff() {
				System.out.println("추상메소드 turnOff() 구현");
			}
			public void setVolume(int volume) {
				System.out.println("추상메소드 setVolume(" + volume +")구현");
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(200);
	}
}
