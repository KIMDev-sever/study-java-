package flowlayout_lab;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame() {
		// TODO Auto-generated constructor stub
		super("My Frame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		for (int i = 0; i < 10; i++) {
			jPanel.add(new JButton("Button"+i));
		}
		add(jPanel);
		setVisible(true);
	}
}
