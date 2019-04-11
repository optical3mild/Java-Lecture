package oc_190411.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Grep {

	public static void main(String[] args) {
		String testWord = "public";
		String testPath = "D:/Workspace/EGov/Java/ch18/src/sec05"
				+ "/exam15_bufferedInputStream/BufferedInputStreamExample.java";
		
		//입력
//		InputStream input = System.in;
//		Reader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
//		
//		try {
//			System.out.print("찾을 문자열: ");
//			String inputString = br.readLine();
//			
//			System.out.print("파일경로지정: ");
//			String inputPathString = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileReader fr = new FileReader(testPath);
		String textLine;
		String charChecker = String.valueOf(testWord.charAt(0));
		int index = 1;
		while((textLine = br.readLine())!=null) {
			if(textLine.contains(charChecker)) {
				//확인된 부분부터 읽고
				//equals로 비교
				//일치하면 출력
			}
			System.out.printf("%4d: "+textLine+"\n", index++);
		}
		fr.close();
		

	}

}
