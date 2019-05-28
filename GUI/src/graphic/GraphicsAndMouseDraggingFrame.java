package graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsAndMouseDraggingFrame extends JFrame {
	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}
	
	public GraphicsAndMouseDraggingFrame() {
		super("이미지 위 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new ImgPanel2());
		setSize(300,300);
		setVisible(true);
	}
	class ImgPanel2 extends JPanel {
		ImageIcon icon = new ImageIcon("img/img1.jpg");
		Image img = icon.getImage();
		int ovalX=100, ovalY=100; 
		public ImgPanel2() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);
		}
		
	}
	
}
