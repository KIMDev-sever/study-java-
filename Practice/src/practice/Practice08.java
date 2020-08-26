package practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos=new int[7];
		int[] juhee=new int[6];
		int j=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("번호");
		for (int i = 0; i < 13; i++) {
			if(i<=6) {
					lottos[j]=scanner.nextInt();
				if(i==6) {
					j=0;
				}
			}else {
				juhee[j]=scanner.nextInt();
			}
		}
		int count=0;
		boolean isbonus=false;
		for (int i = 0; i < juhee.length; i++) {
			for (int k = 0; k < lottos.length; k++) {
				if(juhee[i]==lottos[k]) {
					count++;
					if(k==6) {
						isbonus = true;
					}
				}
			}
		}
		switch (count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:{
			if(isbonus) {
				System.out.println("2등");
			}else {
				System.out.println("3등");
			}
		}
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("꼴등");
			break;
		}
	}

}
