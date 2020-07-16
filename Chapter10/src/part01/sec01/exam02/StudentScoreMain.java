package part01.sec01.exam02;

import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student students[] = new Student[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			Student stu = new Student();
			System.out.print("이름:");
			stu.name = scanner.next();
			System.out.print("반:");
			stu.ban = scanner.nextInt();
			System.out.print("국어점수:");
			stu.kor = scanner.nextInt();
			System.out.print("영어점수:");
			stu.eng = scanner.nextInt();
			System.out.print("수학점수:");
			stu.mat = scanner.nextInt();
	
			students[i] = stu;
		}
		for (Student stu : students) {
			String output = "이름:" + stu.name + "\n" + "반:" + stu.ban + "\n" + "국어점수:" + stu.kor
					+ "\n" + "영어점수:" + stu.eng + "\n" + "수학점수:" + stu.mat + "\n" + "총점:" + stu.getTotal()
					+ "\n" + "평균:" +stu.getAverage() + "\n";
			System.out.printf(output);
			System.out.println();

		}
		scanner.close();
		
	}

}
