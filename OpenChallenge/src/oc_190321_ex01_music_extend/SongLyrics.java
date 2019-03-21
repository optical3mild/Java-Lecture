package oc_190321_ex01_music_extend;

public class SongLyrics extends Song {
	String lyrics;

	public SongLyrics() {
		super();
	}

	public SongLyrics(String title, String artist, String album, String composer, int year, int track, String[] lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = sumArray(lyrics);
	}

	public SongLyrics(String title, String artist, String album, String[] composer, int year, int track, String[] lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics= sumArray(lyrics);
	}

	@Override
	public void show() {
//		super.show();
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t"+ "lyrics: " + lyrics;
	}
}
