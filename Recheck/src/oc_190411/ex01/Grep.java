package oc_190411.ex01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Grep {

	public static void main(String[] args) {
//		String testWord = "public";
//		String testPath = "D:/Workspace/EGov/Java/ch18/src/sec05/exam15_bufferedInputStream/BufferedInputStreamExample.java";
		
		//입력
		InputStream input = System.in;
		Reader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		
		try {
			System.out.print("찾을 문자열: ");
			String inputString = br.readLine();
			
			System.out.print("파일경로지정: ");
			String inputPathString = br.readLine();
			
			checkFile(inputString, inputPathString);
		} catch (IOException e) {
			System.out.println("입력도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}

	
	public static void checkFile(String name, String path) {
		try {
			FileReader fr = new FileReader(path);			//boolean isExist = file.exists() 로 파일의 존재여부 확인필요?
			BufferedReader br = new BufferedReader(fr);
			String textLine;
			int index = 0;
			while((textLine = br.readLine())!=null) {
				if(textLine.contains(name)) {  //contains: true/false반환 //indexOf: 문자위치/-1반환
					System.out.printf("%4d: "+textLine+"\n", index);
				}
				index++;
			}
			br.close(); //finally에서 실행하여도 됨.
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 오류가 발생했습니다."); //IOException: 읽을 수 없는 파일인 경우?
			e.printStackTrace();
		}
	}
}
