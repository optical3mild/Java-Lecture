package sec07.exam10_array_management;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=9; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				if (problemLocation % 2 == 0) {
					System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
					car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
				} else {
					System.out.println(car.tires[problemLocation-1].location + " KumhoTire로 교체");
					car.tires[problemLocation-1] = new KumhoTire(car.tires[problemLocation-1].location, 15);
				}
			}
			System.out.println("----------------------------------------");
		}
	}
}