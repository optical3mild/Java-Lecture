package exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filepath = "D:/Workspace/EGov/Java/ch18/src/sec05"
				+ "/exam15_bufferedInputStream/BufferedInputStreamExample.java";
		
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		String textLine;							//while loop조건에서 대입
		int index = 1;
		while((textLine = br.readLine())!=null) {	//각 loop마다 textLine에 br.readLine()을 대입한 후 비교
													//while(br.read() != -1) 과의 차이? (사용 시 각줄의 첫글자 보이지 않음)
			System.out.printf("%4d: "+textLine+"\n", index++);
		}
		fr.close();

	}

}
