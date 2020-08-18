package textareaframe_05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	public TextAreaFrame() {
		setTitle("Text Area Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textField=new JTextField(30);
		textField.addActionListener(this);

		textArea=new JTextArea(10,30);
		add(textArea,BorderLayout.CENTER);
		textArea.setEditable(false);
		textArea=new JTextArea(10,30);
		textArea.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(textArea);

		setLayout(new BorderLayout());
		add(textField,BorderLayout.NORTH);
		add(scrollPane,BorderLayout.CENTER);

		pack();
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text=textField.getText()+"\n";
		textArea.append(text);
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

}
