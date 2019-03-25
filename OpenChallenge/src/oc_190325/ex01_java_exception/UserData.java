package oc_190325.ex01_java_exception;

public class UserData {
	private static String[] loginIds = {"abcde", "fghij", "klmno", "pqrst", "uvwxyz"};
	private static String[] passwords = {"abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12"};
	private int index = 0;
	
	public UserData() {}
	
	//입력값과 일치하는것이 있는지 확인
	public boolean matchId(String id) throws InvalidLoginIdException {
		boolean result = false;
		for(int i=0; i<loginIds.length; i++) {
			if(id.equals(loginIds[i])) { //각 인덱스를 확인하면서 일치하는 인덱스 값 저장.
				this.index = i;
				result = true;
				break; //더이상 확인없이 for loop 정지
			}
		}
		if(!result) {
			throw new InvalidLoginIdException("로그인 아이디가 없습니다."); //모두 매치한 후 없는경우 나오는 결과
		}
		return result;
	}
	
	public boolean matchPw(String pw) throws IncorrectPasswordException {
		boolean result = false;
			if(! pw.equals(passwords[index])) {
				throw new IncorrectPasswordException("패스워드를 잘못 입력하셨습니다.");
			} else {
				result = true;
			}
		return result;
	}
	//두 메소드를 하나로 합칠것.(git허브 참조하여 수정할것.)
	
}
