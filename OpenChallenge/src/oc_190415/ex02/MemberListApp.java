package oc_190415.ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class MemberListApp {

	public static void main(String[] args) {
		//파일을 읽어온다
		//객체에 저장
		//중복된 데이터를 제거 : 성명,전화번호 일치 --> 동일회원
		//가나다 순서대로 정렬
		
		String testPath = "D:/Workspace/EGov/Java/OpenChallenge/src/oc_190415/ex02/addrInput.txt";
		
		try {
			FileReader fr = new FileReader(testPath);			//파일을 읽어온다
			BufferedReader br = new BufferedReader(fr);			//readLine()사용을 위한 보조스트림
			String memInfo;										//spilt을 사용하기 위한 문자열 참조변수
			String[] memData = new String[3];					//spilt한 내용을 저장하고 출력하기 위한 문자열 배열 참조변수
			TreeSet<Member> member = new TreeSet<Member>();		
			
			while((memInfo = br.readLine()) != null) {	//암기 --> 상용구문
				memData = memInfo.split(",",3);					//split("구분자", 만들어질 부분 문자열의 수)
				
				Member memF = new Member();
				memF.setName(memData[0]);
				memF.seteMail(memData[1]);
				memF.setpNum(memData[2]);
				
				member.add(memF);
			}
			br.close();
			
			for(Member mem: member) {
				System.out.println(mem);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
