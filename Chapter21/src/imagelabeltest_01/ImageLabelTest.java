package imagelabeltest_01;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		// TODO Auto-generated constructor stub
		setTitle("이미지 레이블");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel=new JPanel();
		label=new JLabel("이미지를 보려면 아래 버튼을 누르세요");
		button=new JButton("이미지 레이블");
		ImageIcon icon=new ImageIcon("icon.gif"); // 이미지를 표시하기위해 필요
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageLabelTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ImageIcon icon=new ImageIcon("dog.gif");
		label.setIcon(icon);
		label.setText(null);
	}

}

