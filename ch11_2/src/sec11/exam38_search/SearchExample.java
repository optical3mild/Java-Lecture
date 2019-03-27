package sec11.exam38_search;

import java.util.Arrays;

import sec11.exam37_sort.Member;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		String[] names = {"홍","박","김"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍");
		System.out.println("찾은 인덱스: " + index);
		
		Member m1 = new Member("홍");
		Member m2 = new Member("박");
		Member m3 = new Member("김");
		Member[] members = { m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	}

}
