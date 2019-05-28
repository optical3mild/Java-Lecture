package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx1 extends JFrame{
	Container contentPane;
	public GraphicsDrawImageEx1() {
		setTitle("drawImage사용 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MPanel panel = new MPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/img1.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20,20,this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();

	}

}
