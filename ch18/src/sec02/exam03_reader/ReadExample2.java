package sec02.exam03_reader;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test2.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			System.out.println(readCharNo);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data); //String data에 저장된 내용을 출력
		reader.close();
	}

}
