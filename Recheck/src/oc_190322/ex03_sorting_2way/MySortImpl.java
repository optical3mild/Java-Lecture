package oc_190322.ex03_sorting_2way;

import java.util.Arrays;

public class MySortImpl implements MySort {
	@Override
	public String[] sort(String[] strArray) {
		int size = strArray.length;
		String[] newArray = Arrays.copyOf(strArray, size);
		//bubble sort
		for (int i=0; i<size-1; i++) {
			for (int k=i+1; k<size; k++) {
				if (newArray[i].compareTo(newArray[k]) > 0) {
					String str = newArray[i];
					newArray[i] = newArray[k];
					newArray[k] = str;
				}
			}
		}
		return newArray;
	}
	@Override
	public String[] sort(String[] strArray, boolean descOrder) {
		int size = strArray.length;
		String[] newArray = Arrays.copyOf(strArray, size);
		//bubble sort 역방향
		if (descOrder) {
			for (int i=0; i<size-1; i++) {
				for (int k=i+1; k<size; k++) {
					if (newArray[i].compareTo(newArray[k]) < 0) {
						String str = newArray[i];
						newArray[i] = newArray[k];
						newArray[k] = str;
					}
				}
			}
		} else
			newArray = sort(strArray); // 오름차순 정렬메소드 호출
		return newArray;
	}
}
