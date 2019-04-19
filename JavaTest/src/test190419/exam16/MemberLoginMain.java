package test190419.exam16;

import java.util.Scanner;

public class MemberLoginMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[로그인]");
		
		System.out.print("ID> ");
		int inputId = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드> ");
		String password = scan.nextLine();
		
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = mDao.selectMemberById(inputId);
		
		if (inputId != mDto.getId()) {
			System.out.println("ID가 존재하지 않습니다.");
			System.exit(-1);
		} 
		if (!password.equals(mDto.getPassword())) {
			System.out.println("패스워드가 틀렸습니다.");
			System.exit(-1);
		} 
		
		System.out.println("로그인 되었습니다.");
		scan.close();
	}
}
