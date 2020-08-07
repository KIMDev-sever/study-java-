package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class WindowExample1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f1 = new Frame();
		Frame f2 = new Frame("title");
		f1.setVisible(true);
		f2.setVisible(true);
		f1.setSize(200,200);
		f2.setSize(300,300);
		
		//현재 사용하는 모니터의 사이즈 가로 세로를 Dimensioin클래스에 넣어준다.
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-(f1.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2)-(f1.getHeight()/2);
		f1.setLocation(xpos,ypos);
		f1.setResizable(false);
	}

}
