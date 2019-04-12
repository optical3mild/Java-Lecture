package oc_190322.ex02_my_multi;

public class MyMultiImpl implements MyMulti {

	@Override
	public int max(int[] array) {
		int max = array[0]; //혹은 0으로 초기화
		for(int i=0; i<array.length; i++) { //배열 첫번째부터 확인할 것.
			if(array[i]>=max) { //index1부터 확인하면 1개의 원소가 있는 경우 오류발생
				max = array[i];
			}
		}
		return max;
	}
	@Override
	public int min(int[] array) {
		int min = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]<=min) {
				min = array[i];
			}
		}
		return min;
	}
	@Override
	public int sum(int[] array) {
		int sum = 0;
		for(int atom : array) {
			sum += atom;
		}
		return sum;
	}
	@Override
	public double avg(int[] array) {
		double avg = 0;
		avg = (double) sum(array) / array.length;
		return avg;
	}
}
