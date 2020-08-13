package action_event_test1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame10 extends JFrame{
	JPanel jPanel;
	JButton btn1;
	JButton btn2;
	public MyFrame10() {
		super("이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn1=new JButton("노랑색");
		btn2=new JButton("핑크색");
		jPanel=new JPanel();
		jPanel.add(btn1);
		jPanel.add(btn2);
		btn1.addActionListener(new MyListener());
		btn2.addActionListener(new MyListener());
		add(jPanel);
		pack();
		setSize(300,200);
		setVisible(true);
		
	}
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color color=Color.yellow;
			if(e.getSource()==btn2) {
				color=color.pink;
			}
			jPanel.setBackground(color);
		}
		
	}
}
