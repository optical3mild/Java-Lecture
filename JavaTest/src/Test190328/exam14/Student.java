package Test190328.exam14;

import java.util.Objects;

public class Student extends Person {
	//필드
	private int id;
	private String name;
	private int score;
	
	//생성자
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	//메소드
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
