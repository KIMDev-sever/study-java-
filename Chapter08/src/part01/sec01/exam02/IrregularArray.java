package part01.sec01.exam02;

public class IrregularArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		for (int i = 0; i < intArray.length; i++) {
			int[] arr = i % 2 == 1 ? new int[2] : new int[3];
			int num=((i+1)*10);
			for (int j = 0; j < arr.length; j++) {
				arr[j]=num++;
			}
			intArray[i]=arr;
		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
