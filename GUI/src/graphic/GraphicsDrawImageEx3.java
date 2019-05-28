package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx3 extends JFrame{
	Container contentPane;
	public GraphicsDrawImageEx3() {
		setTitle("drawImage사용 예제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		YPanel panel = new YPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class YPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/img1.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20,20,250,100,100,50,200,200,this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();

	}

}
