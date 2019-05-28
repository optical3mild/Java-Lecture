package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsColorFontEx extends JFrame{
	Container contentPane;
	public GraphicsColorFontEx() {
		setTitle("color, font사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(350,450);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I Love Java", 30, 30);
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}

	public static void main(String [] args) {
		new GraphicsColorFontEx();
	}
} 
