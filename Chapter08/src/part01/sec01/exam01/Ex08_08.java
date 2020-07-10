package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열의 동적 할당(컴파일시가 아니고 실행시 처리되는것)
		Scanner scanner = new Scanner(System.in);
		int row, col;
		System.out.print("행 개수 입력");
		row = scanner.nextInt();
		System.out.print("열 개수 입력");
		col = scanner.nextInt();

		int[][] aa = new int[row][col];
		int i, k;
		int val = 1;
		for (i = 0; i < aa.length; i++) {
			for (k = 0; k < aa[i].length; k++) {
				aa[i][k] = val++;
			}

		}
		int index1 = 0;
		int index2 = 0;
		for (int[] a : aa) {
			index2 = 0;
			for (int j : a) {
				System.out.printf("aa[%d][%d]=%d\n",index1,index2,j );
				index2++;
			}
			index1++;
			System.out.println();
		}
	}

}
