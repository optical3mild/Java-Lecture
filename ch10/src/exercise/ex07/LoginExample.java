package exercise.ex07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {					//예외 객체 생성(P446), 
			System.out.println(e.getMessage()); //getMessage 메소드로 리턴되는 메시지 받아 출력.
		}
	}
	
	public static void login(String id, String password)
							 throws NotExistIDException, WrongPasswordException  {
		//id가 "blue"가 아니라면 NotExistIDException 발생시킴.
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		//password가 "12345"가 아니라면 WrongPasswordException 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다");
			//WrongPasswordException객체 생성과 매개변수로 문자열 반환,
			//main의 try-catch블록에서 반환된 문자열 출력.
		}
	}
}
