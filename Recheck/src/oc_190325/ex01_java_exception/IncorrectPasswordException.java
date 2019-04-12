package oc_190325.ex01_java_exception;

public class IncorrectPasswordException extends Exception {
	public IncorrectPasswordException() {}
	public IncorrectPasswordException(String message) {
		super(message);
	}
}
