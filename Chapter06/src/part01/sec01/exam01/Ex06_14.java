package part01.sec01.exam01;

public class Ex06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%3dX%d=%2d", j, i, j * i);
			}
			System.out.println();
		}
	}

}