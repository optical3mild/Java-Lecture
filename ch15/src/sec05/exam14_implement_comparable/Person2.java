package sec05.exam14_implement_comparable;

import java.util.Objects;

import sec04.exam08_hashmap_2.Student;

public class Person2 implements Comparable<Person2> {
	public String name;
	public int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person2 o) {
		if(this.age<o.age) {
			return -1;
		} else if(this.age == o.age) {
			return 0;
		} else {
			return (name.compareTo(o.name));
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Person person = (Person) obj;
			return (age==person.age) && (name.equals(person.name));
//			return (name.equals(person.name));
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
