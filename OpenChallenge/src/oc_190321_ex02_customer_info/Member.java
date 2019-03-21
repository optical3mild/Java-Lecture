package oc_190321_ex02_customer_info;

public class Member extends Customer {
	int customerNo;
	int mileage;
	
	
	public Member() {
		super();
	}
	
	public Member(String name, String phoneNo, String address, int customerNo, int mileage) {
		super(name, phoneNo, address);
		this.customerNo = customerNo;
		this.mileage = mileage;
	}

	
	
	@Override
	public void show() {
//		super.show();
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Member [customerNo=" + customerNo + ", mileage=" + mileage + "]";
	}
	
	

//	@Override
//	public String toString() { //super.toString 실행x. toString은 현재정의된것이 두번실행됨.
//		return super.toString() + "\n\tMember [" + "customerNo= " + customerNo+ "mileage=" + mileage+"]"; 
//	}
	
	
	
}
