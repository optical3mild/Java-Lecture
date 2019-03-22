package oc_190322.ex03_sorting_2way;

import java.util.Arrays;

public class MySortApp {

	public static void main(String[] args) {
		String[] givenStr = {"자바", "객체", "상속", "인터페이스", "다형성"};

		MySortImpl mySort = new MySortImpl();
		System.out.println(Arrays.toString(mySort.sort(givenStr))); //오름차순
		System.out.println(Arrays.toString(givenStr));
		System.out.println(Arrays.toString(mySort.sort(givenStr, true))); //true : 내림차순
		System.out.println(Arrays.toString(givenStr));
		System.out.println(Arrays.toString(mySort.sort(givenStr, false))); //false : 오름차순
		System.out.println(Arrays.toString(givenStr));
	}
}
