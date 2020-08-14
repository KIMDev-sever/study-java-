package action_event_test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel jPanel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest() {
		// TODO Auto-generated constructor stub
		jPanel=new JPanel(new GridLayout(0,2));
		jPanel.add(new Label("문자를 입력하시오"));
		field=new JTextField(10);
		jPanel.add(field);
		area=new JTextArea();
		add(jPanel,new BorderLayout().NORTH);
		add(area,new BorderLayout().CENTER);
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"keyPressed	");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"keyReleased	");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"keyTyped	");
	}
	protected void display(KeyEvent e, String stringe) {
		char c=e.getKeyChar();
		int keyCode=e.getKeyCode();
		String modifiers="Alt:"+e.isAltDown()+
				"Ctrl:"+e.isControlDown()+
				"Shift:	"+e.isShiftDown();
		area.append(""+c+"문자"+c+"(코드:"+keyCode+")"+modifiers+"\n");
	}
}
