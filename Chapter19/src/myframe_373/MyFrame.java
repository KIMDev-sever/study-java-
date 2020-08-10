package myframe_373;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation((screenSize.width/2)-150,(screenSize.height/2)-100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		JButton button=new JButton("버튼");
	
		this.add(button);
		setVisible(true);
	}
}
