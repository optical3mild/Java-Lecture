package sec05.exam13_compareTo_BubbleSort;

import java.util.Arrays;

public class CompareTestBubbleSort {

	public static void main(String[] args) {
		String[] strArray = {"김","이","박","최","마"};
		
//		Arrays.sort(strArray);
		bubbleSort(strArray);
		System.out.println(Arrays.toString(strArray));
	}
	static void bubbleSort(String[] strArray) {
		int length = strArray.length;
		
		for(int i=0; i<length-1; i++) {
			for(int k=i+1; k<length; k++) {
				//비교하여 조건에 맞으면 swap
				if(strArray[i].compareTo(strArray[k]) > 0) {
					String name = strArray[i];
					strArray[i] = strArray[k];
					strArray[k] = name; 
				}
			}
		}
	}
	
	
}
