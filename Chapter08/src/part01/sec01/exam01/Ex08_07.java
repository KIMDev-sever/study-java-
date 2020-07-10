package part01.sec01.exam01;

public class Ex08_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
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
