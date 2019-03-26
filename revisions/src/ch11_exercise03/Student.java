package ch11_exercise03;

import java.util.Objects;

public class Student {
	//필드
	private String studentNum;
	
	//생성자
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	//메소드
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // instanceof : 참조변수obj가 Student타입으로 형변환이 가능한지 검사
			Student stuNum = (Student) obj;			// -- > true의 경우: 형변환, 저장
			if(studentNum.equals(stuNum.studentNum)) { // --> equals로 비교
				return true;
			}
		}
		return false;									// 형변환 불가 : 같은 객체가 아님(?)
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum); //매개값(class의 필드값)을 이용하여 해시코드를 생성, 리턴
	}
	
	
}
