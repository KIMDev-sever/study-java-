package textfieldframe_04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame() {
		// TODO Auto-generated constructor stub
		JLabel jLabel1=new JLabel("숫자입력:");
		JLabel jLabel2=new JLabel("제곱한값");
		text=new JTextField(15);
	
		result=new JTextField(15);

		result.setEditable(false);
		button=new JButton("OK");
		ButtonListener listener=new ButtonListener();
		button.addActionListener(listener);
		JPanel jPanel=new JPanel();
		setLayout(new BorderLayout());
		jPanel.add(jLabel1);
		jPanel.add(text);
		jPanel.add(jLabel2);
		jPanel.add(result);
		jPanel.add(button);
		add(jPanel);
		setSize(300,130);
		setTitle("제곱 계산하기");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int number=Integer.parseInt(text.getText());
			result.setText(""+(number*number));
		}
		
	}
	public static void main(String[] args) {
		new TextFieldFrame();
	}
}
