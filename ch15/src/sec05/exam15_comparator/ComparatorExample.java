package sec05.exam15_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		//예외발생코드
//		TreeSet<Fruit> trS = new TreeSet<Fruit>();
//		//Fruit이 Comparable을 구현하지 않아 예외발생
//		trS.add(new Fruit("포도",3000));
//		trS.add(new Fruit("수박",10000));
//		trS.add(new Fruit("딸기",6000));

//----------------------------------------------------------------------------		
		//Comparator 구현클래스 이용한 코드
		TreeSet<Fruit> trS2 = new TreeSet<Fruit>(new DescendingComparator());
		trS2.add(new Fruit("포도",3000));
		trS2.add(new Fruit("수박",10000));
		trS2.add(new Fruit("딸기",6000));
		
		//how1
//		Iterator<Fruit> iter = trS2.iterator();
//		while(iter.hasNext()) {
//			Fruit fruit = iter.next();
//			System.out.println(fruit.name+ " : " + fruit.price);
//		}
		
		//how2
		for(Fruit fruit: trS2) {
			System.out.println(fruit.name+ " : " + fruit.price);
		}
		
	}

}
