package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonImageEx extends JFrame{
	Container contentPane;
	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("img/img1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("img/img2.jpg");
		ImageIcon pressedIcon = new ImageIcon("img/img2.jpg");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);

		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonImageEx();


	}

}
