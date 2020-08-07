package part01.sec01.exam01;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Java Program"); //타이틀 바에 표시
		frame.setLocation(500, 500);// 윈도우 위치 지정
		frame.setPreferredSize(new Dimension(300,200)); //프레임 크기 지정
		Container container=frame.getContentPane();
		JLabel label=new JLabel("Hello Java",SwingConstants.CENTER); //라벨 위치지정
		container.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼 윈도우 닫힘 누르면 더스크 종료
		frame.pack();
		frame.setVisible(true);
	}

}
