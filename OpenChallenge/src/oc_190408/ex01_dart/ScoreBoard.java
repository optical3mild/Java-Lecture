package oc_190408.ex01_dart;

public class ScoreBoard {
	public int number;
	public char area;
	public boolean optionStar;
	public boolean optionAcha;
	public int score;
	
	@Override
	public String toString() {
		return "Dart [number=" + number + ", area=" + area + ", optionStar=" + optionStar + ", optionAcha="
				+ optionAcha + ", score=" + score + "]";
	}
}