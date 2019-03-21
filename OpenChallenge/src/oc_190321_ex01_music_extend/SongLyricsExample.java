package oc_190321_ex01_music_extend;

import oc_190320_ex01_music_info.Song;

public class SongLyricsExample {

	public static void main(String[] args) {
		//작곡자가 여러명일때
		String[] composers = new String[] {"Freddie Mercury","Roger Meddows Taylor",
				"Brian Harold May", "John Richard Deacon"};
		
		String[] lyrics = new String[] {"Love of my life, you've hurt me", 
										"\n\t\t You've broken my heart and now you leave me",
										"\n\t\t Love of my life, can't you see?",
										"\n\t\t Bring it back, bring it back",
										"\n\t\t Don't take it away from me, because you don't know",
										"\n\t\t What it means to me"};
		
		Song song1 = new Song("Love of My Life", "Queen", 
							  "A Night at the Opera", "Freddie Mercury", 1975, 9);
		Song song2 = new Song("Love of My Life", "Queen", 
							  "A Night at the Opera", composers, 1975, 9);
		SongLyrics songLyrics1 = new SongLyrics ("Love of My Life", "Queen", 
												"A Night at the Opera", "Freddie Mercury", 1975, 9, lyrics);
		SongLyrics songLyrics2 = new SongLyrics ("Love of My Life", "Queen", 
												"A Night at the Opera", composers, 1975, 9, lyrics);
		
		song1.show();	//한명의 작곡가, 가사없음
		song2.show();	//여러명의 작곡가, 가사없음
		songLyrics1.show();	//한명의 작곡가, 가사있음
		songLyrics2.show();	//여러명의 작곡가, 가사있음
	}
}
