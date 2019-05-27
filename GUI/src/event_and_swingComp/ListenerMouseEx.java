package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerMouseEx extends JFrame {
	ListenerMouseEx() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listner = new MyMouseListener();
		btn.addMouseListener(listner);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListenerMouseEx();
	}
	
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.BLUE);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.RED);
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
		
	}

}
