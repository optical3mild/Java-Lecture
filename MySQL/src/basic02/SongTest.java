package basic02;

public class SongTest {

	public static void main(String[] args) {
		SongDAO sDao = new SongDAO();
		
//		SongDTO sDto = new SongDTO("빨간맛", "빠빠빨간 맛 궁금해 허니");
//		sDao.insertSong(sDto);
		
//		SongDTO sDto = sDao.selectOne(117);
//		System.out.println(sDto.toString() + "\n");
		
		SongDTO sDto = sDao.selectOne(119);
//		System.out.println(sDto.toString() + "\n");
//		sDto.setTitle("넌 이즈 뭔들");
//		sDto.setLyrics("나 지금 너 땜에 혼란스러");
//		sDao.updateSong(sDto);
//		sDto = sDao.selectOne(118);
//		System.out.println(sDto.toString() + "\n");

		sDao.deleteSong(sDto);
		sDao.close();
	}

}
