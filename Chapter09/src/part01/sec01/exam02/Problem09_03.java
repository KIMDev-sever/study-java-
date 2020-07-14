package part01.sec01.exam02;



public class Problem09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		System.out.println("** 로또 추첨을 시작합니다.**");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = getNumber();
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		System.out.print("추첨된 번호 ==>");
		for (int i : lotto) {
			System.out.printf(" %d", i);
		}
	}

	static int getNumber() {
		return (int) (Math.random() * 45 + 1);
	}
}
