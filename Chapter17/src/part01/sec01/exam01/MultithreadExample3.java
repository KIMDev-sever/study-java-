package part01.sec01.exam01;

public class MultithreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
		for (char c : arr) {
			System.out.print(c);
		}
	}

}

class SmallLetters implements Runnable { //인터페이스 런어블로 사용된 클래스를 
										//스래드생성자에 넣어 실행시키는 방법도 있음
	public void run() {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
	}
}
