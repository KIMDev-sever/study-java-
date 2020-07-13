package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str, strRep, strsub, strAry[];
		System.out.println("문자열을 입력하시오");
		str = scanner.nextLine();
		strRep = str.replace(" ", "$");
		strsub = str.substring(3, 8);
		strAry=str.split(" ");
		System.out.println("입력문자열:"+str);
		System.out.println("바꾼문자열:"+strRep);
		System.out.println("일부문자열:"+strsub);
		for (int i = 0; i < strAry.length; i++) {
			System.out.println("분리한 문자열"+strAry[i]);
		}
	}

}
