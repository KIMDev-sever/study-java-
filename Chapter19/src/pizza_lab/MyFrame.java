package pizza_lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel jPanel=new JPanel();
		JPanel jPanel1=new JPanel();
		JPanel jPanel2=new JPanel();
		//jPanel.setLayout(new BorderLayout());
		add(jPanel);
		jPanel.add(jPanel1);
		jPanel.add(jPanel2);
		jPanel1.add(new JLabel("자바 피자에 오신것을 환영합니다 피자의 종류를 선택하시오"));
		jPanel2.add(new JButton("콤보피자"));
		jPanel2.add(new JButton("포테이토피자"));
		jPanel2.add(new JButton("불고기피자"));
		jPanel2.add(new JLabel("개수"));
		jPanel2.add(new JTextField(10));
		setVisible(true);
	}
}
