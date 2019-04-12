package oc_190411.ex02_hexadump;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class HexaDump {

	public static void main(String[] args) {
//		String testPath = "D:/Workspace/EGov/Java/ch18/src/sec05/exam15_bufferedInputStream/BufferedInputStreamExample.java";
//		convertFile(testPath);
		
		InputStream input = System.in;
		Reader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		
		try {
			System.out.print("파일경로지정: ");
			String inputPathString = br.readLine();
			
			convertFile(inputPathString);
		} catch (IOException e) {
			System.out.println("경로입력도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void convertFile(String path) {
		FileInputStream fis;
		BufferedInputStream	bis;
		try {
			fis = new FileInputStream(path);
			bis	= new BufferedInputStream(fis);
			byte[] data = new byte[16];
			int len;
			int counter = 0;
			while((len = bis.read(data)) != -1) { //data크기만큼 bis를 읽고 저장. 읽은 byte수를 리턴
				System.out.printf("%08X: ",counter); //8자리 HexaCode형식으로 출력
				counter += len;						//글자 수 만큼 count
				for(int i=0; i<len; i++) {
					System.out.printf("%02X ", data[i]); //byte type으로 저장된 데이터를 16진수 형식으로 출력.
					if(i==7) System.out.print(" ");
				}
				if (len != 16) { //읽어올 Data가 16byte보다 작을 때, 3칸 공백처리
					for (int i=len; i<16; i++) {
						System.out.print("   ");
						if(i==7) System.out.print(" "); //8번째 문자 출력 후 공백처리
					}
				}
				System.out.print(" ");
				
				for(int i=0; i<len; i++) {
					if(!(data[i]>32 && data[i]<=126)){
						System.out.print(".");
					} else {
						System.out.print((char)data[i]);
					}
					if(i==7) System.out.printf(" ");
				}
				System.out.printf("\n");
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 읽는도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}

}
