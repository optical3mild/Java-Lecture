package basic05_Exercise;

import java.util.List;
import java.util.Scanner;

public class BbsApps extends MemberApps {
	static Scanner scan = new Scanner(System.in);
//	static MemberDAO mDao = new MemberDAO();
	static BbsDAO bDao = new BbsDAO();
	
	//1. 글쓰기
	static void createContents(int memberId) {
		System.out.println("[1.글쓰기]");
		System.out.print("제목> ");
		String title = scan.nextLine();
		System.out.print("내용> ");
		String content = scan.nextLine();
		
		bDao.insertText(new BbsDTO(memberId, title, content));
		System.out.println();
	}
	
	//2. 조회
	static void showContentsList() { //조회 시 memberId 대신 name이 보이도록 수정필요.
		System.out.println("[2.조회]");
		List<BbsDTO> contents = bDao.selectContentsAll();
		for(BbsDTO content : contents) {
			System.out.println(content.toString());
		}
	}	
	
	//3. 변경 : MemberDTO 객체의 id값이 필요함.
	static void modiContents(MemberDTO mDto) {
		System.out.println("[3.변경]");
		//Id기준 search로 본인의 글 list를 보여줌
		List<BbsDTO> contents = bDao.selectListByMemberId(mDto.getId());
		for(BbsDTO content : contents) {
			System.out.println(content.toString());
		}
		
		System.out.print("수정할 글을 선택하세요(Id 입력)> ");
		int inputId = Integer.parseInt(scan.nextLine());
		BbsDTO text = bDao.selectContentById(inputId); //Id와 일치하는 객체생성
		
		System.out.print("제목(" + text.getTitle() + ")> ");
		String title = scan.nextLine();
		if (title.length() != 0) { //입력값 없을경우, 변경전 정보가 그대로 입력됨.
			text.setTitle(title);
		}
		
		System.out.print("내용(" + text.getContent() + ")> ");
		String content = scan.nextLine();
		if (content.length() != 0) {
			text.setContent(content);
		}
		
		bDao.updateText(text, mDto.getId());
	}
	
	//4. 삭제
	static void deleteContents(MemberDTO mDto) {
		System.out.println("[4.삭제]");
		//Id기준 search로 본인의 글 list를 보여줌
		List<BbsDTO> contents = bDao.selectListByMemberId(mDto.getId());
		for(BbsDTO content : contents) {
			System.out.println(content.toString());
		}
		
		System.out.print("삭제할 글을 선택하세요(Id 입력)> ");
		int inputId = Integer.parseInt(scan.nextLine());
		BbsDTO bDto = bDao.selectContentById(inputId); //Id와 일치하는 객체생성
		bDao.deleteText(bDto, mDto.getId());
	}
	
	//5. 상세조회
	// 입력: id  --> 출력: title, name, date, content
	static void searchDetail( ) {
		
	}
	

//	@Override
//	public boolean memberLogin() {
//		boolean result = false;
//		System.out.println("[6.로그인]");
//		System.out.print("ID> ");
//		int inputId = Integer.parseInt(scan.nextLine());
//		System.out.print("패스워드> ");
//		String password = scan.nextLine();
//		
//		MemberDTO mDto = mDao.selectMemberById(inputId);
//		
//		if (inputId != mDto.getId()) {
//			System.out.println("ID가 존재하지 않습니다.");
//			result = false;
//		}
//		if (!password.equals(mDto.getPassword())) {
//			System.out.println("패스워드가 틀렸습니다.");
//			result = false;
//		} else {
//			System.out.println("로그인 되었습니다.");
//			result = true;
//		}
//		return result;
//	}
}
