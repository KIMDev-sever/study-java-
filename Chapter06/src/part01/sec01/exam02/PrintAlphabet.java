package part01.sec01.exam02;

import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		System.out.println("알파벳 한문자를 입력바람");
		char lowerBound;
		char c = 0;
		try {

			c = (char) rd.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("키보드 입력 중 에러 ");
		}

		if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
			System.out.println("알파벳아님.");
			System.exit(0);
		}
		if ((c >= 'a' && c <= 'z')) {
			lowerBound = 'a';
		} else {
			lowerBound = 'A';
		}
//		int len = c - lowerBound;
//		for (int i = 0; i <= len; i++) {
//			for (int j = lowerBound; j <= c; j++) {
//				System.out.printf("%c", j);
//			}
//			c--;
//			System.out.println();
//		}
		for (char i =c; i >= lowerBound; i--) {
			for (int j = lowerBound; j <=i; j++) {
				System.out.printf("%c", j);
			}
			System.out.println();
		}

	}

}
