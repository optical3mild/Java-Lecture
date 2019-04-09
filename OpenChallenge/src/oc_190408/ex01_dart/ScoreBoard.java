package oc_190408.ex01_dart;

public class ScoreBoard {
	public int number;			//입력된 게임정보 중 점수값(score)으로 저장하기 전 보관하는 필드
	public char area;			//영역 SDT 정보를 저장하는 필드
	public boolean optionStar;	//*값의 유무를 저장하는 필드
	public boolean optionAcha;	//#값의 유무를 저장하는 필드
	public int score;			//각 필드에 저장된 정보를 총합하여 회차마다 계산된 점수를 저장하는 필드
	
	@Override
	public String toString() {
		return "Dart [number=" + number + ", area=" + area
					+ ", optionStar=" + optionStar + ", optionAcha="
					+ optionAcha + ", score=" + score + "]";
	}
}