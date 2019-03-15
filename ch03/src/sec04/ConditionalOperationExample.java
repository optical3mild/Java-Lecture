package sec04;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 60;
		//char grade = (score>90) ? 'A' : ((score>80)?'B':((score>70)?'C':((score>60)?'D':'F')));
		char grade = score>90 ? 'A':
					 score>80 ? 'B':
					 score>70 ? 'C':
					 score>60 ? 'D':'F';
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
