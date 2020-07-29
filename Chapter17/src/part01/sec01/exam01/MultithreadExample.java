package part01.sec01.exam01;

/*
 * 스래드(thread)란?
 * 프로그램의 실행흐름을 말한다
 * 하나의 프로그램내에서 독립적으로 실행되는 메서드
 * 규칙
 * 1) Thread 상속
 * 2) 실행 run()오버라이딩
 * 3) start()로 실행(?)
 */
class DigitThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000); // = settimeout
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

public class MultithreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitThread digitThread = new DigitThread();
		digitThread.start();
		for (char i = 'A'; i < 'Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000); // = settimeout
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
