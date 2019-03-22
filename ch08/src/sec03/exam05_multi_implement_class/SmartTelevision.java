package sec03.exam05_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
}
