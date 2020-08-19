package comboboxframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame implements ActionListener {
	
	JLabel label;
	public ComboBoxFrame() {
		// TODO Auto-generated constructor stub
		setTitle("콤보박스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);

		String[] animals = { "dog", "lion", "tiger" };
		JComboBox animalList=new JComboBox(animals);
		animalList.setSelectedItem(0);
		animalList.addActionListener(this);
		
		label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(animals[animalList.getSelectedIndex()]);
		setVisible(true);
		add(animalList,BorderLayout.NORTH);
		add(label);
	}

	private void changePicture(String name) {
		// TODO Auto-generated method stub
		ImageIcon icon=new ImageIcon(name+".gif");
		label.setIcon(icon);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox cb=(JComboBox)e.getSource();
		String name=(String)cb.getSelectedItem();
		changePicture(name);
	
	}

}
