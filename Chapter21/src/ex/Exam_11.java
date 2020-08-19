package ex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_11 extends JFrame implements ActionListener {
	String[] bloodType = { "A", "B", "O","AB" };
	JLabel label;

	public Exam_11() {
		// TODO Auto-generated constructor stub
		JComboBox bloodTypeList = new JComboBox(bloodType);
		bloodTypeList.setSelectedItem(0);
		String name=(String)bloodTypeList.getSelectedItem();
		bloodTypeList.addActionListener(this);
		JLabel label1=new JLabel("당신의 혈핵형은");
		label = new JLabel();
		label.setText("선택하신 혈액형:"+name);
		setTitle("frame예제");
		setLayout(new GridLayout(3,1));
		add(label1);
		add(bloodTypeList);
		add(label);
		setSize(300,200);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox cb=(JComboBox)e.getSource();
		String name=(String)cb.getSelectedItem();
		label.setText("선택하신 혈액형:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_11();
	}

}
