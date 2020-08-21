package Ex1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyImage01 extends Canvas {
	private Image img;

	public void setImg(Image img) {
		this.img = img;
	}

	public void paint(java.awt.Graphics g) {
		g.drawImage(img, 20, 20, this.getWidth() - 40, this.getHeight() - 40, this);
	}

}

class MyFrame10 extends JFrame implements ActionListener {
	private JButton bt1 = new JButton("바위");
	private JButton bt2 = new JButton("가위");
	private JButton bt3 = new JButton("보");
	private JButton bt4 = new JButton("시작");
	private JButton bt5 = new JButton("종료");

	private MyImage01 image01 = new MyImage01();
	private BorderLayout bl = new BorderLayout();
	private Label msg = new Label("메세지: 시작버튼을 누르면 게임이 시작됩니다");

	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(5, 1, 5, 5);

	public void init() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(bl);
		con.add("North", msg);
		con.add("Center", image01);
		con.add("East", p);
		p.setLayout(gl);
		p.add(bt4);
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt5);
	}

	public void start() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
	}

	public MyFrame10(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.init();
		this.start();
		super.setSize(500, 400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == bt5) {
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다.", "종료", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		} else if (e.getSource() == bt4) {
			image01.setImg(Toolkit.getDefaultToolkit().getDefaultToolkit().getImage("fastrcp.gif"));
			image01.repaint();

		} else {
			int res = e.getSource() == bt1 ? 1 : e.getSource() == bt2 ? 2 : 3;
			process(res);
		}

	}

	public void process(int res) {
		int comsu = (int) (Math.random() * 3 + 1);

		switch (comsu) {
		case 1:
	
			image01.setImg(Toolkit.getDefaultToolkit().getDefaultToolkit().getImage("r.jpg"));
			image01.repaint();
			if(res==1) {
				msg.setText("비겼습니다.");
			}else if(res==2) {
				msg.setText("당신이 졌습니다.");
			}else {
				msg.setText("당신이 이겼습니다.");
			}
			break;
		case 2:
			image01.setImg(Toolkit.getDefaultToolkit().getDefaultToolkit().getImage("c.jpg"));
			image01.repaint();
			if(res==1) {
				msg.setText("당신이 이겼습니다.");
			}else if(res==2) {
				
				msg.setText("비겼습니다.");
			}else {
				msg.setText("당신이 졌습니다.");
			
			}
			break;
		case 3:
			image01.setImg(Toolkit.getDefaultToolkit().getDefaultToolkit().getImage("p.jpg"));
			image01.repaint();
			if(res==1) {
				msg.setText("당신이 졌습니다.");
			}else if(res==2) {
				msg.setText("당신이 이겼습니다.");
			}else {
				msg.setText("비겼습니다.");
			}
			break;
		default:
			break;
		}
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame10 frame10 = new MyFrame10("가위바위보게임");
	}

}
