package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerSample extends JFrame {
	ListenerSample() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listner = new MyActionListener();
		btn.addActionListener(listner);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListenerSample();
	}
	
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
		
	}

}
