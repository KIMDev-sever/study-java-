package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.GridLayout;

class MyFrame7 extends Frame{
	private Button btn=new Button("입력");
	private BorderLayout bl=new BorderLayout();
	private Panel p2=new Panel();
	private TextField text1=new TextField();
	private TextField text2=new TextField();
	private TextField text3=new TextField();
	private Panel p3=new Panel();
	private Panel p4=new Panel();;
	private Label lb1=new Label("이름",Label.LEFT);
	private Label lb2=new Label("주소",Label.LEFT);
	private Label lb3=new Label("전화번호",Label.LEFT);
	private GridLayout gl=new GridLayout(1,2);
	private GridLayout gl1=new GridLayout(3,1);
	private GridLayout gl2=new GridLayout(3,1);
	public MyFrame7(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLayout(bl);
		this.add("South",btn);
		this.add(p2);
		p2.setLayout(gl);
		p2.add(p3);
		p3.setLayout(gl1);
		p3.add(lb1);
		p3.add(lb2);
		p3.add(lb3);
		p2.add(p4);
		p4.setLayout(gl2);
		p4.add("Right",text1);
		p4.add("Right",text2);
		p4.add("Right",text3);
		setSize(250,150);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}
	
}
public class WindowExample2 {
	
	public static void main(String[] args) {
		MyFrame7 frame=new MyFrame7("연락처 프로그램");
	}
}
