package sec02.exam03_runtime_exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneralExceptionFile {

	public static void main(String[] args) {
		String path = "c:/Temp/test.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file, true);
			fw.write("A quick brown fox");
			fw.flush();
			
			//객체닫기ㅎ
			fw.close();
		} catch (IOException e) { //예외 처리
			e.printStackTrace();
		}
	}
}
