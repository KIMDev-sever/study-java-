package part01.sec01.exam02;

public class Fruitseller {
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;// final 상수선언

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("남은사과:"+numOfApple);
		System.out.println("판매수익:"+myMoney);
		
	}
}
