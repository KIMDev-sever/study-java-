package Ex1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyButton05 extends Button {
	private Image img;

	public MyButton05(Image img) {
		this.img = img;
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyFrame05 extends JFrame implements ActionListener, Runnable {
	private MyButton05 bt[] = new MyButton05[9];
	private Label tiem_lb = new Label("시간:10초", Label.CENTER);
	private Label score_lb = new Label("점수:0점", Label.CENTER);
	private Button start_bt = new Button("시작");
	JPanel center_p;
	//
	private int ransu;
	private int co = 0;

	//
	int sec = 10;

	public void init() {
		center_p = new JPanel();
		JPanel east_p = new JPanel();
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		east_p.setPreferredSize(new Dimension(100, 300));
		east_p.setLayout(new GridLayout(3, 1));
		east_p.add(tiem_lb);
		east_p.add(score_lb);
		east_p.add(start_bt);
		start_bt.addActionListener(this);
		this.add("East", east_p);
		center_p.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < bt.length; i++) {
			Image img = getToolkit().getImage("du1.jpg");
			bt[i] = new MyButton05(img);
			bt[i].setEnabled(false);
			center_p.add(bt[i]);
		}
	}

	public void start() {
		//
		for (int i = 0; i < bt.length; i++) {
			bt[i].addActionListener(this);
		}
	}

	public MyFrame05(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.init();
		this.start();
		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (sec >= 0) {
			try {
				tiem_lb.setText("시간:" + sec + "초");
				this.sec = sec - 1;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (sec <= 0) {
			this.sec=10;
			this.co=0;
			center_p.removeAll();
			for (int i = 0; i < bt.length; i++) {
				Image img = getToolkit().getImage("du1.jpg");
				bt[i] = new MyButton05(img);
				center_p.add(bt[i]);
			}
			
			center_p.updateUI();
			start_bt.setEnabled(true);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == start_bt) {
			for (int i = 0; i < bt.length; i++) {
				bt[i].setEnabled(true);
			}
			start_bt.setEnabled(false);
			score_lb.setText("점수:0점");
			tiem_lb.setText("시간:10초");
		
			Thread th = new Thread(this);
			th.start();
			this.gameStart();
			
		} else {
			for (int i = 0; i < bt.length; i++) {
				if (e.getSource() == bt[i]) {
					this.game(i);
				}
			}
		}

	}

	public void game(int i) {
		if (ransu == i) {
			co++;
			score_lb.setText("점수 :" + co + "점");
			gameStart();
			center_p.remove(i);
			Image img = getToolkit().getImage("du1.jpg");
			bt[i]=new MyButton05(img);
			bt[i].addActionListener(this);
			center_p.add(bt[i],i);
			center_p.updateUI();
		}
	}

	public void gameStart() {
		int ran = (int) (Math.random() * 9 );
		while (ran==ransu) {
			ran = (int) (Math.random() * 9 );
			
		}
		this.ransu = ran;
		center_p.remove(ran);
		Image img = getToolkit().getImage("du2.jpg");
		bt[ran]=new MyButton05(img);
		bt[ran].addActionListener(this);
		center_p.add(bt[ran],ran);
		center_p.updateUI();

		
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame05("frame예제");
	}

}
