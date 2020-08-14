package action_event_test1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements ActionListener {
	boolean flg = false;
	private int light_number = 0;
	JButton button;

	public MyPanel2() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		button = new JButton("change light_number");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}

	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if (light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 200, 100, 100);
		} else{
			g.setColor(Color.GREEN);
			g.fillOval(100, 300, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (++light_number == 3) {
			light_number = 0;
		}
		repaint();
	}

}

public class TrafficLightTest extends JFrame {
	public TrafficLightTest() {
		// TODO Auto-generated constructor stub
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TrafficLightTest();
	}

}
