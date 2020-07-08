package part01.sec01.exam01;

public class Ex07_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap = 0;
		for (i = 1; i <= 100; i++) {
			hap += i;
		}
		if (hap > 500) {
			return; //종료;
		}
		System.out.printf("1~100까지의 합:%d\n", hap);
		System.out.println("프로그램의 끝입니다.");
	}

}
