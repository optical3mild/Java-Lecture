package event_and_swingComp;
import javax.swing.*; //javax :java extends

public class FrameTest2 extends JFrame { // test2: 상속방식. 현업에서 사용
	
	public FrameTest2() { //생성자 : 객체 생성 시 초기화 담당
		setTitle("창"); //창 title 2
		setLocation(200, 300); //창의 위치
		setSize(300, 500); //창 크기설정
		setResizable(false); //창 크기고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x클릭시 background에서도 꺼지게 setting
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest2();
	}

}
