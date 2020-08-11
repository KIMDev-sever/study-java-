package calculatator_lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator {
	private static JPanel jPanel;
	private static JTextField field;
	private static JButton[] buttons;
	private static String[] labels = { 
			"Backspace", "", "", "CE", "C", 
			"7", "8", "9", "/", "sqrt", 
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "x/-", ".", "+", "=" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		field=new JTextField();
		field.setBackground(Color.pink);
		frame.setLayout(new BorderLayout());
		frame.setSize(500,300);
		frame.add("North", field);
		jPanel=new JPanel();
		jPanel.setLayout(new GridLayout(5,5,1,1));
		buttons=new JButton[labels.length];
		int index=1;
		for (int i = 0; i < labels.length; i++) {
			buttons[i]=new JButton(labels[i]);
		
			if((index==4) || (index==5)){
				buttons[i].setForeground(Color.red);
			}else {
				buttons[i].setForeground(Color.blue);
			}
			if(index==5) {
				index=1;
			}else {
				index++;
			}
			buttons[i].setBackground(Color.YELLOW);
			jPanel.add(buttons[i]);
		}
		frame.add("Center",jPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
