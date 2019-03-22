package sec03.exam03_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(200); //volume 제한 걸리지 않음.다시
		rc.setVolume(-200);
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(200);
		rc.setVolume(-200);
		rc.setVolume(5);
		rc.turnOff();
	}
}
