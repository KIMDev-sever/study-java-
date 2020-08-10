package random_number;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JPanel p=new JPanel();
	JLabel labels[]=new JLabel[30];

	public MyFrame() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(null);
		p.setBackground(Color.yellow);

		for (int i = 0; i < 30; i++) {
			labels[i]=new JLabel(String.valueOf(i));
			int x=(int)(500*Math.random());
			int y=(int)(200*Math.random());
	
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(20,20);
			p.add(labels[i]);
		}
		setSize(500,300);
		add(p);
		setVisible(true);

	}
}
