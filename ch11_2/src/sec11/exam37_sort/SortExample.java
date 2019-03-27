package sec11.exam37_sort;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍","박","김"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍");
		Member m2 = new Member("박");
		Member m3 = new Member("김");
		Member[] members = { m1, m2, m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"]="+members[i].name );
		}

	}

}
