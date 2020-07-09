package part01.sec01.exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StuSungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.print("학생수를 입력");
		count = scanner.nextInt();
		String[] students = new String[count];
		int[] rank = new int[count];
		int[] score = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.print("이름");
			String name = scanner.next();
			System.out.print(i + 1 + "번쨰 국어점수입력");
			int kor = scanner.nextInt();
			System.out.print(i + 1 + "번쨰 수학점수입력");
			int math = scanner.nextInt();
			System.out.print(i + 1 + "번쨰 영어점수입력");
			int eng = scanner.nextInt();
			int total = kor + math + eng;
			students[i] = name;
			score[i] = total;
			rank[i] = 1;
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = (count - 1); j >= 0; j--) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		
			System.out.println(students[i] +" "+ score[i]  +" "+  rank[i]);
		}//머리가 안돌아가서 시간이 걸렸음
	}

}
