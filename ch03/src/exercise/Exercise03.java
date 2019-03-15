package exercise;

public class Exercise03 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);  // 조건문 : true(90보다 크지않다.) --> 출력 : "가"
	}

}
