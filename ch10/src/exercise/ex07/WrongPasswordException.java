package exercise.ex07;

public class WrongPasswordException extends Exception { //Exception을 상속
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);									//Exception의 생성자 호출
	}
}