package exercise.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			System.out.println("-----------");
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//-----------------------메소드 ----------------------------------
	//계좌생성하기
	private static void createAccount( ) {
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine(); // 입력값과 계좌리스트 비교, 일치여부 확인
		
		for(int i=0; i<accountArray.length; i++) { //계좌목록 확인, 빈위치에 입력값 저장
			if(accountArray[i] == null) {
				System.out.print("계좌주: ");
				String owner = scan.nextLine();
//				System.out.print('\n');
				
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(scan.nextLine());
//				System.out.print('\n');
				
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	//계좌목록보기
	private static void accountList( ) {
		System.out.println("계좌목록");
		System.out.println("-----------");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String ano = accountArray[i].getAno();
				String owner = accountArray[i].getOwner();
				int balance = accountArray[i].getBalance();
				System.out.println(ano + "\t" + owner + "\t" + balance);
			}
		}
	}
	//예금
	private static void deposit( ) {
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		Account currentAccount = findAccount(ano);
		
		if(currentAccount != null) {
			System.out.print("예금액: ");
			int saveMoney = Integer.parseInt(scan.nextLine());
			currentAccount.setBalance(currentAccount.getBalance()+saveMoney);
			System.out.println("결과: "+saveMoney+ "원 입금하였습니다");
		}
	}
	//출금
	private static void withdraw( ) {
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		Account currentAccount = findAccount(ano);
		
		if(currentAccount != null) {
			System.out.print("출금액: ");
			int drawMoney = Integer.parseInt(scan.nextLine());
			if(currentAccount.getBalance()-drawMoney <= Account.MIN_VALUE) {
				System.out.println("계좌 잔액이 부족합니다.");
				System.out.println("결과: 출금실패");
			} else {
				currentAccount.setBalance(currentAccount.getBalance()-drawMoney);
				System.out.println("결과: "+ drawMoney + "원 출금하였습니다");
			}
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) { //계좌를 찾으면 계좌반환, 찾지 못하면 null반환
		Account found = null;						//변수 초기화 필요
		for(int i=0; i<accountArray.length; i++) {
			if((accountArray[i].getAno()).equals(ano)) {
				found = accountArray[i];
				break;
			} else {
				System.out.println("결과: 계좌가 없습니다");
			}
		}
		return found;
	}
}
