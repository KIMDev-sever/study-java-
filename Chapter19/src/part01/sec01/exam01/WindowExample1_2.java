package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;


class Myframe extends Frame {
	private Label label=new Label("안녕하세요 awt연습 ",Label.RIGHT);
	public Myframe(String title) {
		// TODO Auto-generated constructor stub
		super(title);

		setSize(400, 300);
		add(label);
		setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - (getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2) - (getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
	}

}

public class WindowExample1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe frame=new Myframe("MyFrame exameple");
		//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
