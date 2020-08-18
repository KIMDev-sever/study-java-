package radiobuttonframe_03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener {
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;

	public RadioButtonFrame() {
		// TODO Auto-generated constructor stub
		topPanel = new JPanel();
		topPanel.add(new Label("어떤 크기의 커프를 주문 하시겠습니까?"));
		ButtonGroup size = new ButtonGroup();
		small = new JRadioButton("small Size");
		medium = new JRadioButton("medium Size");
		large = new JRadioButton("large Size");
		size.add(small);
		size.add(medium);
		size.add(large);
		sizePanel = new JPanel();
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		text = new JLabel("크기가 선택되지 않았습니다");
		text.setForeground(Color.red);
		resultPanel = new JPanel();
		resultPanel.add(text);
		add(topPanel, BorderLayout.NORTH);
		add(sizePanel, BorderLayout.CENTER);
		add(resultPanel, BorderLayout.SOUTH);
		setTitle("라디오 버튼");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JRadioButton button = (JRadioButton) e.getSource();
		if (button == small) {
			text.setFont(text.getFont().deriveFont((float) 10.0));
		} else if (button == medium) {
			text.setFont(text.getFont().deriveFont((float) 15.0));
		} else if (button == large) {
			text.setFont(text.getFont().deriveFont((float) 20.0));
		}
		text.setText(e.getActionCommand()+"버튼이 선택되었습니다");

	}

}
