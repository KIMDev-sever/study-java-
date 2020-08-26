package practice;

import java.util.Scanner;

public class Practice03 {
	static float[] answers = new float[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자1");
		float a = scanner.nextFloat();
		System.out.println("숫자2");
		float b = scanner.nextFloat();
		cal(a, b);
	}

	public static void cal(float a, float b) {
		float result = answers[0]; // init result
		//귀찮아 대강해 ~_~
		answers[0] = a + b;
		answers[1] = b + a;
		answers[2] = a - b;
		answers[3] = b - a;
		answers[4] = a * b;
		answers[5] = b * a;
		answers[6] = a / b;
		answers[7] = b / b;
		answers[8] = (float) Math.pow(a,b);
		answers[9] =(float) Math.pow(b,a);
		
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < answers.length; j++) {
				result = (result > answers[j]) ? result : answers[j];
			}
		}
		System.out.printf("%f", result);
	}

}
