package event_and_swingComp;
import javax.swing.*; //javax :java extends

public class FrameTest {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//JFrame jf = new JFrame("창"); //창 title 1
		jf.setTitle("창"); //창 title 2
		
		jf.setLocation(200, 300); //창의 위치
		jf.setSize(300, 500); //창 크기설정

		jf.setResizable(false); //창 크기고정
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x클릭시 background에서도 꺼지게 setting
		
		jf.setVisible(true);
		
	}

}
