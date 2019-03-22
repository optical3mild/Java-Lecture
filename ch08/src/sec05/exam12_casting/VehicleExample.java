package sec05.exam12_casting;

import sec05.exam11_method_polymorphism.*;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;  //강제타입변환
		
		bus.run();
		bus.checkFare();

	}

}
