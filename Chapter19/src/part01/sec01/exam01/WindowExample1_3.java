package part01.sec01.exam01;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;

class MyFrame2 extends Frame{
	private Button bt1=new Button("확인1");
	private Button bt2=new Button("확인2");
	private Button bt3=new Button("확인3");
	private Button bt4=new Button("확인4");
	private Button bt5=new Button("확인5");
	private Button bt6=new Button("확인6");
	private Button bt7=new Button("확인7");
	private Button bt8=new Button("확인8");
	
	private FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
	public MyFrame2(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLayout(f1);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		
		setSize(400,300);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}
}
public class WindowExample1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 frame=new MyFrame2("MyFrame exameple");
	}

}
