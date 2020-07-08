package part01.sec01.exam01;

public class Ex07_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap = 0;
		for (i = 1; i <= 100; i++) {
			if ((i % 3) != 0) {
				hap += i;
			} else {
				continue;
			}
		}
		System.out.printf("1~100까지의 합(3의배수 제외):%d\n", hap);
	}

}
