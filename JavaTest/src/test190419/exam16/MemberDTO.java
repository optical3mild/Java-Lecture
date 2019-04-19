package test190419.exam16;

public class MemberDTO {
	private int id;
	private String password;
	
	
	public MemberDTO() {}
	
	public MemberDTO(int id, String password, String name, String birthday, String address) {
		this.id = id;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + "]";
	}

}