package exercise.ex14;

public class Member {
	String name; //이름
	String id; //아이디
	String password; //패스워드
	int age; //나이
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
}