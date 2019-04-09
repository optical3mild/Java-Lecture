package exercise.ex08;

public class Student {
	public int stuNum;
	public String name;
	
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (stuNum==student.stuNum);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return stuNum;
	}
}
