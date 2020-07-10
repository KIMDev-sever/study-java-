package part01.sec01.exam02;

import java.util.ArrayList;

public class ReturnArray {
	public static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray = makeArray();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=10;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

		}
	}

}
