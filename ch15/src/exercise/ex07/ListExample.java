package exercise.ex07;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList(); //List<Board>타입의 컬렉션을 리턴
		
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" +board.getContent());
		}
	}

}
