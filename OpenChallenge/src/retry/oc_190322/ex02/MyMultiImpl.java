package retry.oc_190322.ex02;

public class MyMultiImpl implements MyMulti {

	public int max(int[] array) {
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>=max) {
				max = array[i];
			}
		}
		return max;
	}

	public int min(int[] array) {
		int min = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]<=min) {
				min = array[i];
			}
		}
		return min;
	}

	public int sum(int[] array) {
		int sum = 0;
		for(int atom : array) {
			sum += atom;
		}
		return sum;
	}

	public double avg(int[] array) {
		double avg = 0;
		avg = (double) sum(array) / array.length;
		return avg;
	}
}
