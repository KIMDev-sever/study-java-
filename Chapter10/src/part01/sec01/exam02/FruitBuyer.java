
package part01.sec01.exam02;

public class FruitBuyer {
	int myMoney = 5000;
	int numOfApple = 0;

	public void buyApple(Fruitseller seller, int money) {
		numOfApple = seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("현재잔액:"+myMoney);
		System.out.println("사과 갯수:"+numOfApple);
	}
}
