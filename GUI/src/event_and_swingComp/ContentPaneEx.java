package event_and_swingComp;
import javax.swing.*;
import java.awt.*;


public class ContentPaneEx extends JFrame{
	
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.setBackground(Color.ORANGE);
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
