package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowExample2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("연락처 프로그램");
		frame.setPreferredSize(new Dimension(250,150));
		frame.setLocation(500,400);
		Container container=frame.getContentPane();
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new GridLayout(3,2));
		JTextField text1=new JTextField();
		JTextField text2=new JTextField();
		JTextField text3=new JTextField();
		jPanel.add(new JLabel("이름"));
		jPanel.add(text1);
		jPanel.add(new JLabel("주소"));
		jPanel.add(text2);
		jPanel.add(new JLabel("전화번호"));
		jPanel.add(text3);
		container.setLayout(new BorderLayout());
		container.add("Center",jPanel);
		container.add("South",new JButton("입력"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼 윈도우 닫힘 누르면 더스크 종료
		frame.pack();
;		frame.setVisible(true);
	}

}
