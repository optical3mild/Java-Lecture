package oc_190321_ex02_customer_info;

public class Customer {
	//필드
	String name;
	String phoneNo;
	String address;
	
	//생성자
	public Customer() {}

	public Customer(String name, String phoneNo, String address) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	//메소드
	public void show() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
}
