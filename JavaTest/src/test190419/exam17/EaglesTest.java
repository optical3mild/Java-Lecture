package test190419.exam17;

public class EaglesTest {

	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		
		EaglesDTO player = new EaglesDTO(99,"정민철","투수","대전고","우투","우타",1999,"27백만원");
		EaglesDTO newPlayer = new EaglesDTO(98,"박재홍","외야수","인천고","우투","좌타",1995,"30백만원");
		
		//1.선수 등록
//		eDao.insertPlayer(player);
//		System.out.println(eDao.selectOne(99));
		
		//2.선수 트레이드
//		System.out.println(player.getBackNo()+"번 선수를 "+ newPlayer.getBackNo()+"선수로 트레이드 합니다.");
//		System.out.println(player.toString());
//		System.out.println(newPlayer.toString());
//		eDao.deletePlayer(eDao.selectOne(player.getBackNo()));
//		eDao.insertPlayer(newPlayer);
		
		eDao.deletePlayer(eDao.selectOne(newPlayer.getBackNo()));
		eDao.close();
	}
}
