package sec03.exam06_hashset_2;

import java.util.Objects;

public class Member2 {
	public String name;
	public int age;
	public String tel;
	
	public Member2(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			return member.name.equals(name) && member.tel.equals(tel);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tel);
//		return name.hashCode() + age;
	}
}
