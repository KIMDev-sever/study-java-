package part01.sec01.exam01;

public class Ex08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int[3][4];
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
