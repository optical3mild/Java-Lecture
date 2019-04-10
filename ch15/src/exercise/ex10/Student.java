package exercise.ex10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	
	@Override
	public int compareTo(Student arg0) {
		if(this.score<arg0.score) return -1;
		else if(this.score>arg0.score) return 1;
		else return this.id.compareTo(arg0.id);
	}
}
