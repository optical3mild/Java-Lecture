package sec03.exam02_argument;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//how1
		fi = (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		fi.method(2);
		
		//how2
		fi = (x) -> { System.out.println(x*5);};
		fi.method(2);
		
		//how3
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}
