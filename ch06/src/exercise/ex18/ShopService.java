package exercise.ex18;
	//ShopService 객체를 싱글톤으로.
	//getInstance()메소드로 싱글톤을 받을 수 있도록

public class ShopService {
	//필드
	private static ShopService shopServ = new ShopService();
	
	//생성자
	private ShopService() {}
	
	//메소드
	static ShopService getInstance() {
		return shopServ;
	}
}