package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx2 extends JFrame{
	Container contentPane;
	public GraphicsDrawImageEx2() {
		setTitle("drawImage사용 예제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MPanel2 panel = new MPanel2();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MPanel2 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/img1.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0,0,this.getWidth(),this.getHeight(),this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();

	}

}
