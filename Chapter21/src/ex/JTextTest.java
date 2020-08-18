package ex;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextTest extends JFrame{
	private JLabel label,label1,label2;
	private JTextField id;
	private JPasswordField pass;
	private JButton login,signin;
	private JTextArea area;
	
	public JTextTest() {
		// TODO Auto-generated constructor stub
		super("JText테스트");
		label=new JLabel("아이디와 패스워드를 입력해주세요");
		label1=new JLabel("아이디");
		id=new JTextField(10);
		pass=new JPasswordField(10);
		label2=new JLabel("패스워드");
		login=new JButton("로그인");
		signin=new JButton("회원가입");
		area=new JTextArea(5,15);
		setLayout(new BorderLayout());
		JPanel jPanel=new JPanel();
		jPanel.add(label);
		jPanel.add(label1);
		jPanel.add(id);
		jPanel.add(label2);
		jPanel.add(pass);
		jPanel.add(login);
		jPanel.add(signin);
		jPanel.add(area);
		add(jPanel);
		setSize(230,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextTest();
	}

}
