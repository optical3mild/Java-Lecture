package oc_190415.ex03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordCount {

	public static void main(String[] args) {
		//파일을 읽어 단어의 갯수를 세는 프로그램
		//입력: 텍스트		 구분자: "., "
		//출력: 
		//	총단어 수 = 나눈 텍스트의 갯수
		//	가장 많이 나온 단어 순서대로 단어 10개 
		//	단어의 빈도
		
		String subText;
		StringTokenizer st;
		int totalCounter = 0;
		
		String testPath = "D:/Workspace/EGov/Java/OpenChallenge/src/oc_190415/ex02/addrInput.txt";
		
		try {
			FileReader fr = new FileReader(testPath);	//파일을 읽어온다
			BufferedReader br = new BufferedReader(fr);
			HashMap<String, Integer> wordsMap = new HashMap<String, Integer>(); 
			String flashKey;
			Integer flashValue;
			
			while((subText = br.readLine()) != null) {
				st = new StringTokenizer(subText,",");
				while(st.hasMoreTokens()) {				//HashMap에 단어, 갯수 저장
					flashValue = 1;
					flashKey = st.nextToken().trim();
					if(wordsMap.containsKey(flashKey)) {
						flashValue += wordsMap.get(flashKey);
					} 
					wordsMap.put(flashKey, flashValue);
					totalCounter++;
				}
			}
			br.close();
			
//			int testValue = 0; //확인용도
			TreeSet<Word> wordsSet = new TreeSet<Word>();
			Set<String> keySet = wordsMap.keySet();
			Iterator<String> keyIter = keySet.iterator();
			while(keyIter.hasNext()) {					//TreeSet에 일괄 저장
				flashKey = keyIter.next();
				flashValue = wordsMap.get(flashKey);
//				testValue += flashValue;
				wordsSet.add(new Word(flashKey, flashValue));
			}
			
			System.out.println("총 단어 수: " + totalCounter);
			System.out.println("단어목록");
			Iterator<Word> descIter = wordsSet.descendingIterator();
			int printCounter = 0;
			while(printCounter<10) {
				System.out.println(descIter.next());
				printCounter++;
			}
//			for(Word word: wordsSet) { //전체출력
//				System.out.println(word);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
