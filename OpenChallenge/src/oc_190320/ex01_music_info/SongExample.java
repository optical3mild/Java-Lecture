package oc_190320.ex01_music_info;

public class SongExample {

	public static void main(String[] args) {
		Song song1 = new Song("Love of My Life", "Queen", 
				"A Night at the Opera", "Freddie Mercury", 1975, 9);
		
		song1.show();
		
		System.out.println();
		
		//작곡자가 여러명일때
		String[] composers = new String[] {"Freddie Mercury","Roger Meddows Taylor",
											"Brian Harold May", "John Richard Deacon"};
		Song song2 = new Song("Love of My Life", "Queen", 
				"A Night at the Opera", composers, 1975, 9);
		song2.show();
	}

}
