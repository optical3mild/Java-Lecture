package sec03.exam06_hashset_2;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public String tel;
	
	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
//		return name.hashCode() + age;
	}
}
