package oc_190410.ex03_sorting_with_treeset;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String rank;
	private LocalDate joinDate;
	
	
	public Employee() {}

	public Employee(int id, String name, String rank, LocalDate joinDate) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.joinDate = joinDate;
	}

	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getRank() {return rank;}
	public LocalDate getJoinDate() {return joinDate;}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rank=" + rank + ", joinDate=" + joinDate + "]";
	}

	@Override
	public int compareTo(Employee o) { //TreeSet 사용 --> 컬렉션에 객체 추가시 compareTo로 비교하여 자동정렬
		Position thisPos = Position.valueOf(rank);
		Position oPos = Position.valueOf(o.rank);
		
		if(thisPos.compareTo(oPos)>0) return 1;					//직급우선 비교
		if(thisPos.compareTo(oPos)<0) return -1;
		if(joinDate.compareTo(o.getJoinDate())>0) return 1;		//입사일 비교
		if(joinDate.compareTo(o.getJoinDate())<0) return -1;
		return name.compareTo(o.getName());						//이름비교
	}
	
	
}
