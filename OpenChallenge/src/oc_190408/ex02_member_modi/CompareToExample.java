package oc_190408.ex02_member_modi;

public class CompareToExample {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동","GD_H","gdh",35);
		Member member2 = new Member("신용권", "Dragon_Rock","drr",40);
		
		int result = member1.compareTo(member2);
		System.out.println(result);
	}
}
