package sec03;

public class EnhancedForExample {

	public static void main(String[] args) {
		String[] names = {"김","이","박","곽","권","노","백","유","이","정","천"};
		
		for (String name : names) { //enhanced for loop (type 지역변수 : 배열이름)
			System.out.println(name);
		}
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
