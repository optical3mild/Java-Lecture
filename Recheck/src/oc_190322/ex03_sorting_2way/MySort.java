package oc_190322.ex03_sorting_2way;

public interface MySort { //메소드 Overload
	//오름차순 정렬
	public abstract String[] sort(String[] strArray);
	//내림차순 정렬
	public abstract String[] sort(String[] strArray, boolean descOrder);
}
