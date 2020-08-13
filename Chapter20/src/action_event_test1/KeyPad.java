package action_event_test1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	JTextField field;
	JButton buttons[];
	public KeyPad() {
		// TODO Auto-generated constructor stub
		super("keypad_test");
		field = new JTextField();
		setLayout(new BorderLayout());
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(field, BorderLayout.NORTH);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3, 3));
		buttons = new JButton[9];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setPreferredSize(new Dimension(100, 100));
			buttons[i].addActionListener(this);
			jPanel.add(buttons[i]);
		}
		add(jPanel);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyPad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = field.getText() +e.getActionCommand();
		field.setText(text);
	}

}
