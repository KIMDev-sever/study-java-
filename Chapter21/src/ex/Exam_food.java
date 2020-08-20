package ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Food {
	private String name;
	private int price;

	public Food(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}

class MyButton08 extends Button {
	private Image img;

	public MyButton08(Image img) {
		// TODO Auto-generated constructor stub
		this.img = img;
	}

	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, this.getWidth() - 10, this.getHeight() - 10, this);
	}

}

class MyFrame09 extends JFrame implements ActionListener {
	private String[] name = new String[] { "짜장면", "짬 뽕", "순대국", "뼈해장국", "소불고기", "제육볶음", "소갈비찜", "카츠카레", "청국장" };
	private int price[] = new int[] { 5000, 6000, 7000, 8000, 8000, 10000, 7000, 7000 ,7000};

	private String str = "주문내역\n-------------\n";
	private ArrayList<Food> list=new ArrayList<Food>();
	private Button bt[]=new Button[9];
	private JTextArea ta=new JTextArea(str);
	int total=0;
	String choose="";
	public void init() {
		JPanel center_p=new JPanel();
		JPanel east_p=new JPanel();
		this.setLayout(new BorderLayout());
		this.add("Center",center_p);
		east_p.setPreferredSize(new Dimension(200,300));
		this.add("East",east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add("Center",ta);
		center_p.setLayout(new GridLayout(3,3));
		for (int i = 0; i < bt.length; i++) {
			Image img=Toolkit.getDefaultToolkit().getImage("images\\food"+(i+1)+".png");
			bt[i]=new MyButton08(img);
			bt[i].repaint();
			list.add(new Food(name[i], price[i]));
			bt[i].setName(String.valueOf(i));
			center_p.add(bt[i]);
		}
		ta.append("-------------\n 합계:"+total);
	}
	public void start() {
		for (int i = 0; i < bt.length; i++) {
			bt[i].addActionListener(this);
		}
	}
	public MyFrame09(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.init();
		this.start();
		this.setSize(500,300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button button=(Button) e.getSource();
		int i =Integer.parseInt(button.getName());
		ta.setText(str);
		total+=list.get(i).getPrice();
		choose+=list.get(i).getName()+"     "+list.get(i).getPrice()+"\n";
		String text= ta.getText()+choose+"-------------\n 합계:"+total;
		ta.setText(text);
	}
}

public class Exam_food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame09 myframe09=new MyFrame09("frame예제");
		myframe09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
