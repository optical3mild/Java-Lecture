package execise.classopench_with_Array;

public class StudentScore {
	//필드 : 성명, 수/영/과 각 점수, 평균점수
	//private 설정 : getter/setter 생성하여 필드값에 접근가능.
	private String name;
	private int math;
	private int eng;
	private int sci;
	private double avg;
	
	//생성자 : 성명, 수/영/과 각 점수를 매개로 하는 생성자
	//			class이름과 동일한 이름
	public StudentScore(String name, int math, int eng, int sci) { //source에 있음..
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}
	
	//메소드 : toString() 작성 , 평균 double avg()
	public double average() {
		int sum = this.math + this.eng + this.sci;
		this.avg = (double)sum/3;
		return avg;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	@Override //@: annotation
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", eng=" + eng + ", sci=" + sci + ", avg=" + String.format("%.2f",avg) + "]";
	}
}
