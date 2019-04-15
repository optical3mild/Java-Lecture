package oc_190415.ex03;


public class Word implements Comparable<Word> {
	private String word;
	private int num = 0;
	
	public Word(String word, int num) {
		this.word = word;
		this.num = num;
	}

	public String getWord() {return word;}
	public int getNum() {return num;}
	
	
	//TreeSet --> compareTo로 비교, 동일한 것 저장x & 저장 시 순서대로 정렬됨 -->HashMap에 사용할 equals/hashCode 필요없음.
	@Override
	public int compareTo(Word o) { //결과값 -1,0,1 : 조건문 내 조건문에서 리턴 불가여부 확인
//		int result = -2;
//		if(num == o.getNum()) {
//			if(word.compareTo(o.getWord()) == 0) result = 0;
//			else result = word.compareTo(o.getWord());
//		} else if(num != o.getNum()) {
//			if(num > o.getNum()) result = 1; //빈도수가 많은 것 우선순위로 정렬
//			else result = -1;
//		}
//		return result;
		
		//간략화 : 반복횟수 일치 --> 이름비교
		if (num < o.getNum()) return -1;
		if (num > o.getNum()) return 1;
		return word.compareTo(o.getWord());
	}

	@Override
	public String toString() {
		return "[단어: " + word + ", 반복횟수: " + num + "]";
	}
	
}
