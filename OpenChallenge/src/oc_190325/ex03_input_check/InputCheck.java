package oc_190325.ex03_input_check;

import java.util.Arrays;
import java.util.Scanner;

public class InputCheck {

	public static void main(String[] args) {
		//최대10회 입력 --> 입력된 값을 순차적으로 중복체크.
		
		Scanner scan = new Scanner(System.in);
		String[] usrIn = new String[10];
		boolean[] output = new boolean[10];
		
		for(int i=0; i<usrIn.length; i++) {
			System.out.print("값을 입력하세요> ");
			String flashStr = scan.nextLine();		//입력값 임시저장
			if(i == 0) {							//각 배열의 첫번째 값 초기화
				usrIn[i] = flashStr;
				output[i] = true;
				continue;							//초기화 후 다시 루프문 처음으로
			}
			boolean found = true;
			for(int k=0; k<usrIn.length; k++) {
				if(flashStr.equals(usrIn[k])) {		//임시저장한 입력값과 기존배열 비교
					found = false;					//동일값 발견 시 false저장
				} 
			}
			usrIn[i] = flashStr;					//배열에 입력값 순차적으로 저장
			output[i] = found;						//배열에 중복확인값 순차적으로 저장
		}
		scan.close();								//리소스 누수방지
		System.out.println(Arrays.toString(usrIn));	//배열을 String으로 만들어 출력
		System.out.println(Arrays.toString(output));
	}

}
