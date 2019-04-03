package basic03;

import java.util.List;

public class EaglesTest {

	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		
		//insert연습: 입력/출력
//		eDao.insertPlayer(new EaglesDTO(5,"김독","외야수","대전고","우완","좌완",100000));
////		eDao.insertPlayer(new EaglesDTO(6,"오선진","내야수","성남고","우완","우완",7500));
//		EaglesDTO player = eDao.selectOne(5);
//		System.out.println(player.toString());
		
		//select연습: 조회/출력
//		EaglesDTO player = eDao.selectOne(5);
//		System.out.println(player.toString());
		
		//update연습 : 조회/출력 -> 업데이트 -> 조회/출력
//		EaglesDTO player = eDao.selectOne(5);
//		System.out.println(player.toString());
//		player.setPhand("우완");
//		player.setAnnIncome(15000);
//		eDao.updatePlayer(player);
//		player = eDao.selectOne(5);
//		System.out.println(player.toString());
		
		//selectAll연습
//		List<EaglesDTO> playerList = eDao.selectAll();
//		for(EaglesDTO player : playerList) {
//			System.out.println(player.toString());
//		}
		
//		eDao.insertPlayer(new EaglesDTO(500,"김독","외야수","대전고","우완","좌완",100000));
//		EaglesDTO player = eDao.selectOne(500);
//		System.out.println(player.toString());
//		System.out.println();
//		eDao.deletePlayer(player);
//		List<EaglesDTO> playerList = eDao.selectAll();
//		for(EaglesDTO eagle : playerList) {
//			System.out.println(eagle.toString());
//		}
		
//		List<EaglesDTO> playerList = eDao.selectPlayers();
//		System.out.println("연봉 1억원 이상 명단");
//		for(EaglesDTO eagle : playerList) {
//			System.out.println(eagle.toString());
//		}
		
//		List<EaglesDTO> playerList = eDao.selectPlayers2();
//		System.out.println("외야수 명단");
//		for(EaglesDTO eagle : playerList) {
//			System.out.println(eagle.toString());
//		}
		
		String positions[] = {"투수", "포수", "내야수", "외야수"};
		for(String position: positions) {
			List<EaglesDTO> playerList = eDao.selectPlayersByPosition(position);
			System.out.println("포지션이 " +position+"인 선수명단");
			for(EaglesDTO eagle: playerList) {
				System.out.println(eagle.toString());
			}
			System.out.println();
		}
		
		System.out.println("연봉 1억원 이상인 선수명단");
		List<EaglesDTO> playerList = eDao.selectPlayersBySalary(10000);
		for(EaglesDTO eagle: playerList) {
			System.out.println(eagle.toString());
		}
		
		eDao.close();
	}

}
