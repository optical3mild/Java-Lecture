package event_and_swingComp;
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	NullContainerEx() {
		setTitle("NullContainer Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		for(int i=1;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		for(int i=1;i<9;i++) {
			JButton b = new JButton(Integer.toString(i+9));
			b.setLocation((i+9)*15,(9-i)*15);
			b.setSize(50,20);
			c.add(b);
		}
		setSize(350,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
