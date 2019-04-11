package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/Temp/test1.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}
}
