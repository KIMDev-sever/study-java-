package action_event_test1;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;

	public MyPanel() {
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(new File("car.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no image");
			System.exit(0);
		}
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keycode = e.getKeyCode();

				switch (keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				default:
					break;
				}
				repaint();
			}
		});
		this.requestFocus();// 키 이벤트를 받을 컴포넌트를 강제로 설정
		setFocusable(true);

		/*
		 * 키 이벤트의 포커스를 받을 수 있는 컴포넌트가 여러개 있을 경우
		 */
	}
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
	}
}

public class CarGameTest extends JFrame {
	
	public CarGameTest() {
		// TODO Auto-generated constructor stub
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarGameTest();
	}

}
