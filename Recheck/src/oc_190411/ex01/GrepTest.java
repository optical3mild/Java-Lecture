package oc_190411.ex01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GrepTest {

	public static void main(String[] args) {
		String testWord = "public";
		String testPath = "D:/Workspace/EGov/Java/ch18/src/sec05"
				+ "/exam15_bufferedInputStream/BufferedInputStreamExample.java";
		
		//입력
//		InputStream input = System.in;
//		Reader reader = new InputStreamReader(input);
//		BufferedReader br = new BufferedReader(reader);
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
		
		try {
			FileReader fr = new FileReader(testPath);
			BufferedReader br = new BufferedReader(fr);
			String textLine;
			int index = 1;
			while((textLine = br.readLine())!=null) {
				if(textLine.contains(testWord)) {
					System.out.printf("%4d: "+textLine+"\n", index++);
				}
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
