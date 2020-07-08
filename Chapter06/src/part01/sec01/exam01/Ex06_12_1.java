package part01.sec01.exam01;

public class Ex06_12_1 {
	public static void main(String[]args) {
		int i,j;
		int sum = 0;
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				sum+=j;
			}
		}
		System.out.println("sum="+sum);
	}
}
