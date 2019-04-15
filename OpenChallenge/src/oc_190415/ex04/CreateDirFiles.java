package oc_190415.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateDirFiles {

	public static void main(String[] args) {
		//폴더 생성 : 폴더없는경우, 파일생성 불가
		String masterDirPath = "c:/Temp/Ex04";
		String[] lastFolder = {"low", "mid", "high"};
		String fullPath;
		File folder;
		
		for(int i=0; i<lastFolder.length; i++) {
			for(int k=1; k<4; k++) {
				fullPath = masterDirPath+"/"+lastFolder[i]+"/"+k;
				folder = new File(fullPath);
				folder.mkdirs();
			}
		}
		
		
		//랜덤으로 1,2,3중 하나를 내용으로 갖는 txt파일
		//100개를 하나의 디렉토리 안에 생성
		
		//txt파일 이름생성: 폴더1 안에 3333이하의 이름을 갖는 파일 생성..
		String fileName = null;
		for (int i=0; i<100; i++) {
			int numFile = (int)(Math.random() * 9000) + 1000;
			int numContent = (int)(Math.random() * 3) + 1;
			if (numFile <= 3333) {
				fileName = "c:/Temp/Ex04/low/" + numContent + "/" + numFile + ".txt";
			} else if (numFile <= 6666) {
				fileName = "c:/Temp/Ex04/mid/" + numContent + "/" + numFile + ".txt";
			} else {
				fileName = "c:/Temp/Ex04/high/" + numContent + "/" + numFile + ".txt";
			}
			
			try {
				//파일 생성 : String으로 조합된 파일의 전체경로 위치에 txt파일생성
				FileOutputStream fos = new FileOutputStream(fileName);
				
				
				//파일내용입력
				numContent = (int)(Math.random() * 3) + 1; //랜덤으로 파일에 1,2,3 입력
				int content = (int)'0' + numContent; //(int)'0': 문자 0의 ASCII코드값 --> 0이후 값부터 출력됨
				fos.write(content);
				fos.flush(); //OutputStream의 버퍼에 잔류하는 데이터를 비움
				fos.close();
			} catch (FileNotFoundException e) { //경로에 해당폴더가 없는경우
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
