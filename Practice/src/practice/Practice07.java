package practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = new int[3];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < arrs.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("길이");
			arrs[i] = scanner.nextInt();
		}
		for (int i = 0; i < arrs.length; i++) {
			c = arrs[i];
			for (int j = 0; j < arrs.length; j++) {
				if (c > arrs[j]) {
					c = c;
					if (a == 0) {
						a = arrs[j];
					}else {
						b = arrs[j];
					}
				} else if (c < arrs[j]) {
					c = arrs[j];
				}
			
			}
		}

		if((a+b)>c) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}
