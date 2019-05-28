package graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signal extends JFrame{
	public static void main(String[] args) {
		new Signal();
	}
	public Signal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CPanel());
		setSize(300,500);
		setVisible(true);
	}
	
	class CPanel extends JPanel implements ActionListener {
		boolean flag = false;
		private int light_number = 0;
		
		public CPanel() {
			setLayout(new BorderLayout());
			JButton b = new JButton("traffic light turn on");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(++light_number >= 3)
				light_number = 0;
			repaint();
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);
			if(light_number == 0) {
				g.setColor(Color.RED);
				g.fillOval(100, 100, 100, 100);
			}else if(light_number == 1) {
				g.setColor(Color.green);
				g.fillOval(100, 200, 100, 100);
			}else {
				g.setColor(Color.yellow);
				g.fillOval(100, 300, 100, 100);
			}
		}
	}

}
