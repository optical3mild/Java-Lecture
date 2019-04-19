package test190419.exam17;

public class EaglesDTO {
	private int backNo;
	private String name;
	private String pos;
	private String hs;
	private String phand;
	private String hhand;
	private int birthday;
	private String annIncome;


	public EaglesDTO(int backNo, String name, String pos, String hs, String phand, String hhand, int birthday,
			String annIncome) {
		super();
		this.backNo = backNo;
		this.name = name;
		this.pos = pos;
		this.hs = hs;
		this.phand = phand;
		this.hhand = hhand;
		this.birthday = birthday;
		this.annIncome = annIncome;
	}

	public EaglesDTO() {}

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getHs() {
		return hs;
	}

	public void setHs(String hs) {
		this.hs = hs;
	}

	public String getPhand() {
		return phand;
	}

	public void setPhand(String phand) {
		this.phand = phand;
	}

	public String getHhand() {
		return hhand;
	}

	public void setHhand(String hhand) {
		this.hhand = hhand;
	}
	
	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getAnnIncome() {
		return annIncome;
	}

	public void setAnnIncome(String annIncome) {
		this.annIncome = annIncome;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", pos=" + pos + ", hs=" + hs + ", phand=" + phand
				+ ", hhand=" + hhand + ", birthday=" + birthday + ", annIncome=" + annIncome + "]";
	}
	
}

