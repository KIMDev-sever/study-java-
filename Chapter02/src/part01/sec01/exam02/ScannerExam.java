package part01.sec01.exam02;

import java.util.Scanner; //��ĳ�� Ű���� �Է¿� Ŭ����

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in); //���ɳ� a��ü ����

		System.out.println("����,ü��,������ ��ĭ���� �и��Ͽ� ������� �Է��Ͻÿ�");
		if(a.hasNextDouble()) {
			System.out.println("����� ���̴�"+a.nextInt()+"���Դϴ�.");
			System.out.println("����� ü����"+a.nextDouble()+"kg�Դϴ�.");
			System.out.println("����� ������"+a.nextDouble()+"cm�Դϴ�.");
		}else {
			System.out.println("�����߻�");
		}

		a.close(); //��ĳ�� ����
		
	}

}
