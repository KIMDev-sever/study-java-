package part01.sec01.exam02;

public class ForEachEx {
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	}// 나열 타입

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;
		for (int k : num) {
			sum += k;

		}
		System.out.println("합은" + sum);
		for (String string : names) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (Week day : Week.values()) {
			System.out.println(day+"요일");
		}
	}

}
