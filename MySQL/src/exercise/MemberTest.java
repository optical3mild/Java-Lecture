package exercise;

import java.util.List;

public class MemberTest {

	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
//		mDao.createTable(); //desc member;를 읽어오는 방법?

		//insert연습: 입력/출력
//		mDao.insertMember(new MemberDTO("java", "김자바", "19980712", "대전광역시 서구 월평동 이젠"));
//		List<MemberDTO> members = mDao.selectAll();
//		for(MemberDTO member : members) {
//			System.out.println(member.toString());
//		}
		
		//select연습
//		List<MemberDTO> members = mDao.selectAll();
//		for(MemberDTO member : members) {
//			System.out.println(member.toString());
//		}
		
		//변경연습
		//id로 조회/출력 - select
		//update로 변경된 정보 수정
		//update연습 : 조회/출력 -> 업데이트 -> 조회/출력
//		MemberDTO member = mDao.selectOne(10001);
//		System.out.println(member.toString());
//		member.setName("김쒸");
//		member.setBirthday("19001231");
//		mDao.updateMember(member);
//		member = mDao.selectOne(10001);
//		System.out.println(member.toString());
		
		//삭제연습
//		MemberDTO member = mDao.selectOne(10001);	//삭제 전 대상정보 출력, 확인
//		System.out.println(member.toString());
//		mDao.deleteMember(member);					//삭제
//		List<MemberDTO> members = mDao.selectAll(); //전체검색으로 확인
//		for(MemberDTO member : members) {
//			System.out.println(member.toString());
//		}

		//검색연습
		List<MemberDTO> members = mDao.selectMemberByName("김자바");
		for(MemberDTO member : members) {
			System.out.println(member.toString());
		}
	}
}
