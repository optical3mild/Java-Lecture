package exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;

		double numOfElement = 0;
		int max = 0;
		int min = array[0][0];
		double variance = 0;
		
		for(int i=0; i<array.length; i++) { //합, 평균
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				if(array[i][k]>max) { //최대
					max = array[i][k];
				}
				if(array[i][k]<min) { //최소
					min = array[i][k];
				}
			
			}
			numOfElement += array[i].length;
		}
		avg = sum/numOfElement;
		double head = 0.0;					
			//double head 변수 : loop안에 선언해도 무방하나, loop마다 선언되는 것을 피하는것이 좋다.
		for(int i=0; i<array.length; i++) { //분산
			for(int k=0; k<array[i].length; k++) {
				head = array[i][k]-avg;
				variance += head*head;
			}
		}
		variance = variance/numOfElement;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("variance: " + variance);
	}
}
