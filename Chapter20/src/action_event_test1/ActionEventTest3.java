package action_event_test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class MyFrame3 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;

	public MyFrame3() {
		// TODO Auto-generated constructor stub
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button=new JButton("버튼 을 누르시오");
		label=new JLabel("아직 버튼을 눌려지지 않았습니다");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button){
			//button.setText("마침내 버튼이 눌러젔습니다.");
			label.setText("마침내 버튼이 눌러젔습니다.!!!!");
		}
	}



}

public class ActionEventTest3 {
	
	public static void main(String[] args) {
		MyFrame3 t=new MyFrame3();
	}
}
