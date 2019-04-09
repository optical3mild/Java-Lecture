package sec03.exam06_hashset_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		//이름, 나이로 구분
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30,"010-0000-0000"));
		set.add(new Member("홍길동",30,"010-0000-0001"));

		System.out.println("총 객체수: " +set.size());
		
		
		//이름, 전화번호로 구분
		Set<Member2> set2 = new HashSet<Member2>();
		set2.add(new Member2("홍길동",30,"010-0000-0000"));
		set2.add(new Member2("홍길동",30,"010-0000-1111"));

		System.out.println("전화번호가 다를 때 총 객체수: " +set2.size());
		
		Set<Member2> set3 = new HashSet<Member2>();
		set3.add(new Member2("홍길동",30,"010-0000-0000"));
		set3.add(new Member2("홍길동",30,"010-0000-0000"));

		System.out.println("전화번호가 같을 때 총 객체수: " +set3.size());
	}

}
