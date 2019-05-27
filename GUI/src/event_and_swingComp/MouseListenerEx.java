package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame{
	JLabel la;
	
	MouseListenerEx() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30,30);
		contentPane.add(la);
		setSize(200,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}

	
	
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
