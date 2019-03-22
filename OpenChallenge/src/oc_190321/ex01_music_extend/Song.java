package oc_190321.ex01_music_extend;


public class Song {
	//필드
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	//생성자
	public Song() {
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	//작곡가가 여러명일때
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = sumArray(composer);
		this.year = year;
		this.track = track;
	}
	
	//메소드
	public void show( ) {
		System.out.println(this.toString());
	}

	public String sumArray(String[] array) {
		String returnString = null;
		for(int i=0; i<array.length; i++) {
			if(i == 0) {
				returnString = array[i];
			} else {
				returnString += array[i];
			}
			if(i != array.length-1) {
				returnString += ", ";
			}
		}
		return returnString;
	}
	@Override
	public String toString() {
		return "Song" + "\n\t"
					  + "title: " + title + "\n\t"
					  + "artist: " + artist + "\n\t"
					  + "album: " + album + "\n\t"
					  + "composer: " + composer + "\n\t"
					  + "year: " + year + "\n\t"
					  + "track: " + track;
	}
}
