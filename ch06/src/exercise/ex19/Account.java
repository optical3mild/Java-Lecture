package exercise.ex19;

//Q.잔고(balance)필드 작성
//	1. balance는 음수x, 2.최대 100만원, 3.외부접근 금지

public class Account {
	//필드
	private int balance;
	private int MIN_BALANCE = 0;
	private int MAX_BALANCE = 1000000;
	
	//생성자
	Account() {}

	//메소드
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			System.out.println("잘못된 금액을 입력하셨습니다. 다시 입력하세요");
		}
	}

	
	
//	public int getBalance() {
//		return balance;
//	}

//	public void setBalance(int balance) {
//		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
//			Account.balance = balance;
//		} else {
//			System.out.println("잘못된 금액을 입력하셨습니다. 다시 입력하세요");
//		}
//	}

	//메소드
	
}
