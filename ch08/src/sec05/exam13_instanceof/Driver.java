package sec05.exam13_instanceof;

import sec05.exam11_method_polymorphism.Vehicle;
import sec05.exam12_casting.*;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
