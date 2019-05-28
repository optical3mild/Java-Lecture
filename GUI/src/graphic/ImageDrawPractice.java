package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageDrawPractice extends JFrame {
	public static void main(String[] args) {
		new ImageDrawPractice();
	}
	
	public ImageDrawPractice() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new ImgPanel());
		setSize(300,300);
		setVisible(true);
	}
	class ImgPanel extends JPanel {
		ImageIcon icon = new ImageIcon("img/img1.jpg");
		Image img = icon.getImage();
		public ImgPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
		
	}
	
}
