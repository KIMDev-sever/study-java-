package part01.sec01.exam02;

import java.util.Scanner; //스캐너 키보드 입력용 클래스

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in); //스케너 a객체 생성

		System.out.println("나이,체중,신장을 빈칸으로 분리하여 순서대로 입력하시오");
		if(a.hasNextDouble()) {
			System.out.println("당신의 나이는"+a.nextInt()+"살입니다.");
			System.out.println("당신의 체중은"+a.nextDouble()+"kg입니다.");
			System.out.println("당신의 신장은"+a.nextDouble()+"cm입니다.");
		}else {
			System.out.println("에러발생");
		}

		a.close(); //스캐너 종료
		
	}

}
