package oc_190325.ex01_java_exception;

public class InvalidLoginIdException extends Exception {
	public InvalidLoginIdException() {}
	public InvalidLoginIdException(String message) {
		super(message);
	}
}
