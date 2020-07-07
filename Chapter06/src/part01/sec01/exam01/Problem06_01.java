package part01.sec01.exam01;

public class Problem06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			System.out.printf("#제%d단#\t",i);
		}
		System.out.printf("\n\n");
		for (int j = 1; j <= 9; j++) {
			for (int k = 2; k <= 9; k++) {
				System.out.printf("%dX%2d=%2d ", k, j, k * j);
			}
			System.out.println();
		}
	}

}
