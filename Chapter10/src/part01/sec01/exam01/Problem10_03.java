package part01.sec01.exam01;

public class Problem10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet3 pet1 = new Pet3();
		Pet3 pet2 = new Pet3();
		pet1.setType("강아지");
		pet1.setAge(8);
		pet2.setType("고양이");
		pet2.setAge(13);
		pet1.move();
		pet2.move();
		System.out.println(pet1.getType() + "는" + pet1.getAge() + "개월입니다.");
		System.out.println(pet2.getType() + "는" + pet2.getAge() + "개월입니다.");
		System.out.println("현재 우리집 애완동물수는 " + Pet3.getCount() + "마리입니다.");
	}

}
