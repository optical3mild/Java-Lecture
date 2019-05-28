package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsClipEx extends JFrame{
	Container contentPane;
	public GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel3 panel = new MyPanel3();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel3 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/img1.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50,20,150,150);
			g.drawImage(image, getWidth(),getHeight(),this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String [] args) {
		new GraphicsClipEx();
	}
}
