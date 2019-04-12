package ch06_exercise_ex20_working01;

public class Account {
	//필드
	private String ano;		//계좌번호
	private String owner;
	private int balance;
	static final int MIN_VALUE = 0;
	
	//생성자
	public Account(String ano, String owner, int balance) {
//		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//메소드
//	public int getMin() {
//		return MIN_VALUE;
//	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
