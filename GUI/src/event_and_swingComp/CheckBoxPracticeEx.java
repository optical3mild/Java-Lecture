package event_and_swingComp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxPracticeEx extends JFrame{
	public static void main(String[] args) {
		new CheckBoxPracticeEx();
	}
	
	Container contentPane;
	public CheckBoxPracticeEx() {
		super("CheckBoxPractice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setTitle("CheckBoxPractice");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JCheckBox swBox = new JCheckBox("버튼 비활성화");
		JCheckBox hideBox = new JCheckBox("버튼 감추기");
		JButton testButton = new JButton("test Button");
		
		contentPane.add(swBox);
		contentPane.add(hideBox);
		contentPane.add(testButton);
		
		
		//itemLisener 개별등록
		swBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) { //변화감지
				if(e.getStateChange() == ItemEvent.SELECTED)
					testButton.setEnabled(false);
				else
					testButton.setEnabled(true);
				
			}
		});
		
		hideBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					testButton.setVisible(false);
				else
					testButton.setVisible(true);
			}
		});
		
		setSize(250,200);
		setVisible(true);
	}

}
