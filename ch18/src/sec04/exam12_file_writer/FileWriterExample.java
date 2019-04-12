package sec04.exam12_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("c:/temp/test1.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로 된 "+ "\r\n");
		fw.write("문자열을 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}

}