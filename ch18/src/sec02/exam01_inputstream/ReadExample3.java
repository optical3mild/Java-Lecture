package sec02.exam01_inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		
		byte[] readBytes = new byte[8];
		int readByteNo = is.read(readBytes,2,3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}

}
