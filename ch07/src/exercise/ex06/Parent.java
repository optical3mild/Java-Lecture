package exercise.ex06;

public class Parent {
	public String nation;
	
	public Parent () {
		this("대한민국");
		System.out.println("Parent() Call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
