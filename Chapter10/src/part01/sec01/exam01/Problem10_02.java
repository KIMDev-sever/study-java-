package part01.sec01.exam01;

public class Problem10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet2 pet1 = new Pet2();
		Pet2 pet2 = new Pet2();
		pet1.setType("강아지");
		pet1.setAge(8);
		pet2.setType("고양이");
		pet2.setAge(13);
		pet1.move();
		pet2.move();
		System.out.println(pet1.getType() + "는" + pet1.getAge() + "개월입니다.");
		System.out.println(pet2.getType() + "는" + pet2.getAge() + "개월입니다.");
	}

}
