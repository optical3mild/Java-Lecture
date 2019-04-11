package sec02.exam01_inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while(true) {	//for loop은 읽기 실패가 발생, 데이터를 읽어올때 누락될 수 있음
			readByteNo = is.read(readBytes);
			System.out.println(readByteNo);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
