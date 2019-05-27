package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame{

	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Hello");
	final int FLYING_UNIT = 10;
	
	FlyingTextEx() {
		setTitle("상,하,좌,우");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		la.setLocation(50,50);
		la.setSize(300,300);
		contentPane.add(la);
		setSize(300,300);
		setVisible(true);
		contentPane.requestFocus(); //필수
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN: 
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT); 
				break;
			case KeyEvent.VK_LEFT: 
				la.setLocation(la.getX()-FLYING_UNIT, la.getY()); 
				break;
			case KeyEvent.VK_RIGHT: 
				la.setLocation(la.getX()+FLYING_UNIT, la.getY()); 
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
