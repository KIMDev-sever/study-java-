package action_event_test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener {
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;

	public RockPaperScissor() {
		// TODO Auto-generated constructor stub
		setTitle("가위,바위,보");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3));
		information = new JTextField("아래의 버튼중에서 하나를 클릭하시오!");
		output = new JTextField(20);
		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		setLayout(new BorderLayout());
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockPaperScissor();
	}

	String result(int key) {
		String text = "";
		switch (key) {
		case 0:
			text = "비김";
			break;
		case 1:
		case -2:
			text = "플레이어 승리";
			break;
		case -1:
		case 2:
			text = "컴퓨터 승리";
			break;
		}
		return text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int com = new Random().nextInt(3);
		int player = ROCK;
		switch (e.getActionCommand()) {
		case "PAPER":
			player = PAPER;
			break;
		case "SCISSOR":
			player = SCISSOR;
			break;
		}
		String text = result(player - com);
		output.setText(text);
	}
}
