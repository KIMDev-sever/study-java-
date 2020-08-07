package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

class MyFrame5 extends Frame{
	private Button bt1=new Button("확인1");
	private Button bt2=new Button("확인2");
	private Button bt3=new Button("확인3");
	private Button bt4=new Button("확인4");
	private Button bt5=new Button("확인5");


	private BorderLayout bl=new BorderLayout();
	public MyFrame5(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLayout(bl);
		this.add("North",bt1);
		this.add("South",bt2);
		this.add("West",bt3);
		this.add("East",bt4);
		this.add("Center",bt5);
		
		setSize(400,300);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}
	
}

public class WindowExample1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 frame=new MyFrame5("MyFrame exameple");
	}

}
