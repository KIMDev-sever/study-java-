package part01.sec01.exam01;

public class ArrayVarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3 };
		//
		int arr2[] = arr1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]); // 1 2 3
		}
		//
		System.out.println();
		arr2[1]=7;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);// 1 7 3
		}
	}

}
