package sec07.exam05_field_reset;

public class Korean {

	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	
	public Korean(String name, String ssn) { //매개변수명과 필드의 변수명이 일치
		this.name = name;					//this.name은 필드의 변수명을 가리킴. 자바 디폴트를 확인할 것.
		this.ssn = ssn;
	}

	public void setName(String name) { //source를 사용하여 생성한 자바 디폴트 형식
		this.name = name;
	}
	
	
}
