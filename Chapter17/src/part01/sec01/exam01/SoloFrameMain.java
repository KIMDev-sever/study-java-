package part01.sec01.exam01;

import java.awt.Frame;

class SoloFrame extends Frame {
	public SoloFrame() {
		// TODO Auto-generated constructor stub
		new SoloThread(this).start();
	}
}

class SoloThread extends Thread {
	private Frame f = null;

	public SoloThread(Frame f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("스레드 시작");
		while (i < 20) {
			System.out.print(i + "\t");
			f.setTitle("스레드동작중" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println("스레드 종료");
		}
	}
}

public class SoloFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoloFrame s = new SoloFrame();
		s.setSize(300, 300);
		s.setVisible(true);
	}

}
