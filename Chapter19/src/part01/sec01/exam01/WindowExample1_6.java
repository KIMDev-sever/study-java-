package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

class MyFrame6 extends Frame{
	private Button bt1=new Button("YES");
	private Button bt2=new Button("NO1");
	private Button bt3=new Button("NO2");
	private BorderLayout bl=new BorderLayout();
	private Panel p1=new Panel();
	private Panel p2=new Panel();
	private GridLayout gl=new GridLayout(1,2);
	private GridLayout gl2=new GridLayout(2,1);
	public MyFrame6(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLayout(bl);
		this.add("South",p1);
		p1.setLayout(gl);
		p1.add(bt1);
		p1.add(p2);
		p2.setLayout(gl2);
		p2.add(bt2);
		p2.add(bt3);
		setSize(400,300);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}
	
}

public class WindowExample1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame6 frame=new MyFrame6("MyFrame exameple");
	}

}
