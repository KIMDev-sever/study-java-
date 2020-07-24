package part01.sec01.exam01;

public class ArrayVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		printArray(arr);
		arr = null;
		printArray(arr);
	}

	public static void printArray(int arr[]) {
		if (arr == null) {
			return;
		}
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
