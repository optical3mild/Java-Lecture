package oc_190325.ex03_input_check;

import java.util.Scanner;

public class InputCheck {

	public static void main(String[] args) {
		//최대10회 입력 --> 입력된 값을 순차적으로 중복체크.
		//**매번 Array를 생성, 크기를 늘려간다.
		Scanner scan = new Scanner(System.in);
		
//		String[] sampleIn = {"0123456789", "01234", "0123456789", "6789012345", "01234"};
		String[] usrIn;
		boolean[] output;
		int arrayLength = 1;
		
		for(int i=0; i<arrayLength; i++) {
			usrIn = new String[arrayLength];
			for(int k=0; k<usrIn.length; k++) {
				usrIn[i] = sampleIn[k];
				
			}
		}

	}

}
