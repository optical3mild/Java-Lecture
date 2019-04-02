package basic02;

public class SongDTO {
	//필드
	private int id;
	private String title;
	private String lyrics;
	
	//생성자
	public SongDTO(int id, String title, String lyrics) {
		this.id = id;
		this.title = title;
		this.lyrics = lyrics;
	}
	
	public SongDTO(String title, String lyrics) { //id : auto increment의 경우
		this.title = title;
		this.lyrics = lyrics;
	}

	public SongDTO() {}

	//메소드(get/set/toString)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "SongDTO [Id=" + id +", Title=" +title +", Lyrics=" + lyrics+"]";
	}
}
