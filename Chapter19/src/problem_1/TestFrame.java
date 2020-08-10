package problem_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestFrame extends JFrame{
	
	public TestFrame() {
		// TODO Auto-generated constructor stub
		super("테스트 프레임");
		JPanel jPanel=new JPanel();
		setSize(500,100);
		setResizable(false);
		jPanel.add(new JLabel("자바는 재미있나요?"));
		jPanel.add(new JButton("YES"));
		jPanel.add(new JButton("NO"));
		add(jPanel);
		setVisible(true);
	}
}
