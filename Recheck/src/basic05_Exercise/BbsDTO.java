package basic05_Exercise;

public class BbsDTO {
	private int id;
	private int memberId;
	private String title;
	private String date;
	private String content;
	
	public BbsDTO() {
	}

	//id,date : 자동 / memberId ->로그인 시 받아옴.
	public BbsDTO(int memberId, String title, String content) {
		this.memberId = memberId;
		this.title = title;
		this.content = content;
	}

	public BbsDTO(int id, int memberId, String title, String date, String content) {
		this.id = id;
		this.memberId = memberId;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", memberId=" + memberId + ", title=" + title + ", date=" + date + ", content="
				+ content + "]";
	}
	
}
