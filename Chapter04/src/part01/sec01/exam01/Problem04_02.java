package part01.sec01.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money, c500, c100, c50, c10;
		System.out.print("��ȯ�ҵ���?");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextInt();
		c500 = money / 500; 
		money = money % 500;
		c100 = money / 100;
		money = money % 100;
		c50 = money / 50;
		money = money % 50;
		c10 = money / 10;
		money = money % 10;
		System.out.printf("�����¥��:%d\n", c500);
		System.out.printf("���¥��:%d\n", c100);
		System.out.printf("���ʿ�¥��:%d\n", c50);
		System.out.printf("�ʿ�¥��:%d\n", c10);
		System.out.printf("������:%d\n", money);
		scanner.close();
	}

}
