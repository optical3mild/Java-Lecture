package oc_190408.ex02_member_modi;

public class Member implements Comparable {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {return name;}
	public String getId() {return id;}
	public String getPassword() {return password;}
	public int getAge() {return age;}

	public void setName(String name) {this.name = name;}
	public void setId(String id) {this.id = id;}
	public void setPassword(String password) {this.password = password;}
	public void setAge(int age) {this.age = age;}

	@Override
	public int compareTo(Object o) {
		int result = -2;
		if(o instanceof Member) {
			Member member = (Member) o;
			if(this.age < member.getAge()) {
				result = -1;
			} else if (this.age > member.getAge()) {
				result = 1;
			} else if (this.age == member.getAge()) {
				result = 0;
			}
		}
		return result;
	}
}
