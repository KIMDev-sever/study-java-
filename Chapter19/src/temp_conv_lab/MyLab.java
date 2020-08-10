package temp_conv_lab;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyLab {
	 public static void main(String[] args) {
		JFrame f=new JFrame();
		JPanel jPanel=new  JPanel();
		f.add(jPanel);
		JLabel label1=new JLabel("화씨온도");
		JLabel label2=new JLabel("섭씨온도");
		
		JTextField field1=new JTextField(15);
		JTextField field2=new JTextField(15);
		
		JButton button=new JButton("변환");
		jPanel.add(label1);
		jPanel.add(field1);
		jPanel.add(label2);
		jPanel.add(field2);
		jPanel.add(button);
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도 변환기");
		f.setVisible(true);
		

	}
	
}
