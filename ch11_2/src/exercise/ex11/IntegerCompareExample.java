package exercise.ex11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		//Boxing된 정수값이 -128~127 범위의 값이라면 ==와 !=연산자로 비교가능
		//그외 Boxing된 값은 UnBoxing한 값을 얻어 비교해야 한다. (변수.intValue()사용)
		
		//UnBoxing 후 값 비교
		System.out.println(obj3.intValue() == obj4.intValue());
	}
}
