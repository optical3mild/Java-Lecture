package exercise.ex14;

public class MemberTestExample {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자봐", "javah");
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
	}
}
