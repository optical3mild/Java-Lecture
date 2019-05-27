package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelEx extends JFrame{
	Container contentPane;
	LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다");
		
		ImageIcon beauty = new ImageIcon("img/img1.jpg");
		JLabel imgLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("img/img2.jpg");
		JLabel label = new JLabel("전화해",normalIcon,SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imgLabel);
		contentPane.add(label);
		
		setSize(400,600);
		setVisible(true);

		
	}

	public static void main(String[] args) {
		new LabelEx();


	}

}
