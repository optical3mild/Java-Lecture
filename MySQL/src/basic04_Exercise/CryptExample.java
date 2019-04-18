package basic04_Exercise;

public class CryptExample {
	public static void main(String[] args) {
//		String password = "1234asdf";
//		String cryptedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
//		System.out.println(cryptedPassword);
//		
//		if (BCrypt.checkpw(password, cryptedPassword))
//			System.out.println("true");
//		else
//			System.out.println("false");
		
		MemberDAO mDao = new MemberDAO();
		mDao.initPassword();
		mDao.close();
	}
}