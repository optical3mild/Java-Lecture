package sec02.exam03_reader;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test2.txt");
		//한글자씩 읽지만 InputStream과 다르게 char단위로 읽어오므로 깨지지 않고 한글을 읽어온다.
		//*InputStream : Byte단위
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		reader.close();
	}

}
