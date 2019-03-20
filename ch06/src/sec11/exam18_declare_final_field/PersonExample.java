package sec11.exam18_declare_final_field;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		//p1.nation = "usa";			//수정불가
		//p1.ssn = "454534-4545454";	//수정불가
		p1.name = "을지";
	}

}
