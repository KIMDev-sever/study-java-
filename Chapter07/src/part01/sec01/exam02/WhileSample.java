package part01.sec01.exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sw;
		double hap = 0;
		int avg = 0;
		int n=0;
		while ((sw = scanner.nextInt())!=0) {
			hap +=sw;
			n++;
		}
		avg =(int)(hap / n);

		System.out.printf("평균값:%d", avg);
		scanner.close();
	}

}
