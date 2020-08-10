package problem_2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		super("테스트 프레임");
		JPanel jPanel=new JPanel();
		setSize(350,100);
		setResizable(false);

		jPanel.add(new JLabel("자바 호텔에 오신것을 환영합니다.숙박일수를 입력하세요"));
		for (int i = 1; i <= 5; i++) {
			jPanel.add(new JButton(i+"일"));
		}
		add(jPanel);
		setVisible(true);
	}

}
