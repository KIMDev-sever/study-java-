package ex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame05 extends JFrame implements ActionListener {
	JButton button1;
	JButton button2;

	public MyFrame05() {
		// TODO Auto-generated constructor stub
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		button1.addActionListener(this);
		button2.addActionListener(this);
		setLayout(new GridLayout(2,1));
		add(button1);
		add(button2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();

		String text = button == button1 ? "버튼1번" : "버튼2번";
		System.out.println(text + "을누르셨습니다.");
	}

}

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame05();
	}

}
