package practice;

import java.util.HashMap;
import java.util.Scanner;

class Food {
	String name;
	int kal;

	Food(String name,int kal) {
		this.name=name;
		this.kal=kal;
	}
}

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Food> map=new HashMap<Integer, Food>();
		
		map.put(1, new Food("치즈버거", 400));
		map.put(2, new Food("야채버거", 340));
		map.put(3, new Food("우유", 170));
		map.put(4, new Food("계란말이", 100));
		map.put(5, new Food("샐러드", 70));
		int kal=0;
		for (int i = 0; i < 2; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("메뉴"+(i+1));
			int number=scanner.nextInt();
			kal+=map.get(number).kal;
		}
		if(kal>500) {
			System.out.println("angry");
		}else {
			System.out.println("no angry");
		}

		
	}

}
