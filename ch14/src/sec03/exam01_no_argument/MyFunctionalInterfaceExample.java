package sec03.exam01_no_argument;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//how1
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		//how2
		fi = () -> { System.out.println("method call2");};
		fi.method();
		
		//how3
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
