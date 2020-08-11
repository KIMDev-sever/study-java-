package action_event_test1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener {
	JFrame frame;
	JTextField field;
	JButton button;
	JLabel jLabel;

	public ConfirmButtonActionListener() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(200, 70));
		Container container = frame.getContentPane();
		field = new JTextField();
		button = new JButton("확인");
		jLabel = new JLabel("Hello");

		container.add(field, BorderLayout.CENTER);
		container.add(button, BorderLayout.EAST);
		container.add(jLabel, BorderLayout.SOUTH);
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConfirmButtonActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button){
			//button.setText("마침내 버튼이 눌러젔습니다.");
			jLabel.setText(field.getText());
		}
	}

}
