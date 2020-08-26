package practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays=new int[4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("던짐");
		for (int i = 0; i < 4; i++) {
			arrays[i]=scanner.nextInt();
		}
		int reverseCount=0;
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i]==1) {
				reverseCount++;
			}
		}
		switch (reverseCount) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		default:
			System.out.println("모");
		}
	}

}
