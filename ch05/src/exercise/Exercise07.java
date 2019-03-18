package exercise;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};

		for(int i=0; i<array.length; i++) {
			int atom = array[i];
			if(atom > max) {
				System.out.println(atom+"은/는 "+max+"보다 큽니다.");
				System.out.println(atom+"을/를 저장합니다.");
				max = atom;
			} else {
				System.out.println(atom+"은/는 "+max+"보다 작습니다.");
				System.out.println("다음으로 넘어갑니다.");
			}
		}
		System.out.println("max: " + max);
	}

}
