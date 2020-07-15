package part01.sec01.exam02;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruitseller seller = new Fruitseller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);
		System.out.println("과일 판매자의 현재상황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyResult();
	}

}
