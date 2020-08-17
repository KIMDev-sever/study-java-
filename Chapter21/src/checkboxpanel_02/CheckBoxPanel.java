package checkboxpanel_02;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel implements ItemListener {
	JCheckBox buttons[] = new JCheckBox[3];
	String[] fruits = { "apple", "grape", "orange" };
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

	public CheckBoxPanel() {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(1, 4));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);

			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i] + ".gif");
			icon[i] = new ImageIcon(fruits[i] + ".gif");
		}
		JPanel checkPanel = new JPanel(new GridLayout(3, 1));
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}

		add(checkPanel);

		for (int i = 0; i < pictureLabel.length; i++) {
			add(pictureLabel[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new CheckBoxPanel());
		frame.setSize(50,200);
		frame.setVisible(true);
		new CheckBoxPanel();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		ImageIcon imageIcon = null;
		Object source = e.getItemSelectable();
		for (int i = 0; i < buttons.length; i++) {
			if (source == buttons[i]) {
				
				if(e.getStateChange()==ItemEvent.DESELECTED) {
					pictureLabel[i].setIcon(null);
				}else {
					pictureLabel[i].setIcon(icon[i]);
				}
			}
		}
	

	}

}
