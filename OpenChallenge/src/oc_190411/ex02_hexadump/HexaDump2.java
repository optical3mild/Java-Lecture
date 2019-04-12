package oc_190411.ex02_hexadump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HexaDump2 {

	public static void main(String[] args) {
		String testPath = "D:/Workspace/EGov/Java/ch18/src/sec05/exam15_bufferedInputStream/BufferedInputStreamExample.java";
		convertFile(testPath);
		
	}
	
	//첫글자가 읽히지 않은 이유
	//while의 조건문이 fis.read() == -1 일때,
	//while의 조건문과 for문의 실행문에서 두번 저장되어 첫글자는 출력 누락.
	public static void convertFile(String path) {
		try {
			FileInputStream fis = new FileInputStream(path);
			int[] data = new int[16]; // 기본메소드 read()는 정수형을 반환
									//	: fis.read()는 fis를 한글자 읽고 정수형으로 반환한다.
			int counter = 0;		//행의 처음에 나타나는 counter
			boolean checker = true;	//while문의 정지조건 설정변수
			while(checker) {
				System.out.printf("%08X: ",counter); //8자리 HexaCode형식으로 출력
				
				int insideCounter = 0; //첫번째 for문의 반복횟수 check
				for(int i=0; i<16; i++) {
					data[i] = fis.read(); 
					if(data[i] == -1) {  //더이상 출력할 문자가 없을 때, for문을 빠져나온다
						checker = false;
						break;
					}
					System.out.printf("%02X ", data[i]);
					if(i==7) System.out.print(" ");
					counter++;
					insideCounter++;
				}
				
				//마지막줄 처리
				if(insideCounter != 16) { //읽어올 Data가 16byte보다 작을 때, 3칸 공백처리
					for(int i=insideCounter; i<16; i++) {
						System.out.print("   ");
						if(i==7) System.out.print(" "); //8번째 문자 출력 후 공백처리
					}
				}
				System.out.print(" ");
				
				
				//문자열 출력부분
				for(int i=0; i<insideCounter; i++) {
					if(data[i] == -1) { //읽어올 값이 없을경우, for문을 종료
						break;
					} else if(!(data[i]>32 && data[i]<=126)){ //32<data<=126인 보이지 않는 문자의 경우
						System.out.print(".");
					} else if(i==7) {					//8번째 문자를 출력하고 공백을 추가
						System.out.printf(" ");
					} else {
						System.out.print((char)data[i]); //정수형으로 저장된 값을 문자로 변환하여 출력.
					}
				}
				System.out.printf("\n");
			}
			fis.close();
		} catch (FileNotFoundException e) { //FileInputStream 객체 생성에서 오류가 발생하는 경우.
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {	//read()등 메소드에서 오류가 발생하는 경우.
			System.out.println("파일을 읽는도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}

}
