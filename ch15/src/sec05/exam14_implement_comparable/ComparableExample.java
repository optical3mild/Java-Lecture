package sec05.exam14_implement_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
//		TreeSet<Person> treeSet = new TreeSet<Person>();
//		
//		treeSet.add(new Person("홍", 45));
//		treeSet.add(new Person("김", 25));
//		treeSet.add(new Person("박", 31));

		//how1
//		for(Person person: treeSet) {
//			System.out.println(person.name + " : "+person.age);
//		}
		
		//how2
//		Iterator<Person> iter = treeSet.iterator();
//		while(iter.hasNext()) {
//			Person person = iter.next();
//			System.out.println(person.name + " : "+person.age);
//		}
		
		
		//hashcode, equals재정의
		TreeSet<Person2> treeSet2 = new TreeSet<Person2>();
		
		treeSet2.add(new Person2("홍", 45));
		treeSet2.add(new Person2("김", 25));
		treeSet2.add(new Person2("박", 31));
		treeSet2.add(new Person2("홍", 35));
		treeSet2.add(new Person2("김", 25));
		
		for(Person2 person: treeSet2) {
			System.out.println(person.name + " : "+person.age);
		}
	}

}
