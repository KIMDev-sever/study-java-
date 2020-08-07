package part01.sec01.exam01;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

class MyFrame3 extends Frame{
	private Button bt1=new Button("확인1");
	private Button bt2=new Button("확인2");
	private Button bt3=new Button("확인3");
	private Button bt4=new Button("확인4");
	private Button bt5=new Button("확인5");
	private Button bt6=new Button("확인6");

	private GridLayout gl=new GridLayout(2,3,10,20);
	public MyFrame3(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLayout(gl);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		
		setSize(400,300);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}
	
}
public class WindowExample1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 frame=new MyFrame3("MyFrame exameple");
	}

}
