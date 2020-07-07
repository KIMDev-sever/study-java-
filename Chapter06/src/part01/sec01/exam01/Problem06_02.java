package part01.sec01.exam01;

public class Problem06_02 {
	public static void main(String[] args) {
		for (int i = 0; i < 128; i++) {
			if (i % 16 == 0) {
				System.out.println("-----------------------");
				System.out.printf("10진수\t16진수\t문자\n");
				System.out.println("-----------------------");
			}
			System.out.printf("%5d%5x%5c\n", i, i, i);
		}

	}
}
