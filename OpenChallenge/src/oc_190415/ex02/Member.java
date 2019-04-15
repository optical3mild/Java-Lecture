package oc_190415.ex02;


public class Member implements Comparable<Member>{
	private String name;
	private String eMail;
	private String pNum;
	
	
	public Member() {}

	
	public String getName() {return name;}
	public String geteMail() {return eMail;}
	public String getpNum() {return pNum;}

	//setter는 trim도 필요(공백제거)
	public void setName(String name) {this.name = name.trim();}
	
	public void seteMail(String eMail) { 
		if(!(eMail.contains("@") && (eMail.contains(".com")))) {
			this.eMail = null;
		} else {
			this.eMail = eMail.trim();
		}
	}
	
	public void setpNum(String pNum) {
		if(!(pNum.contains("-") && (pNum.length()>12 && pNum.length()<14))) {
			this.pNum = null;
		} else {
			this.pNum = pNum.trim();
		}
	}

	
	@Override
	public String toString() {
		return "Member [name=" + name + ", eMail=" + eMail + ", pNum=" + pNum + "]";
	}

	
	//TreeSet --> compareTo로 비교, 동일한 것 저장x & 저장 시 순서대로 정렬됨
	@Override
	public int compareTo(Member o) { //결과값 -1,0,1  --> 이름, 전화번호 비교
		
		if(name.compareTo(o.getName()) == 0) { //이름 비교 --> 같으면 전화번호 비교
			if(pNum.compareTo(o.getpNum()) == 0) {	//이름, 전화번호 동일 : 동일인물
				return 0;							
			} else {
				return pNum.compareTo(o.getpNum()); //이름 동일한 경우, 전화번호 비교, 리턴
			}
		} else {
			return name.compareTo(o.getName()); //이름 다를경우, 이름비교값 리턴
		}
	}
	
}
