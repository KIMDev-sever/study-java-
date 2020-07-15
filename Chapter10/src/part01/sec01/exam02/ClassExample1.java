package part01.sec01.exam02;

public class ClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock obj=new GoodsStock("52135",200);
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고:"+obj.stockNum);
		obj.addStock(1000);
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고:"+obj.stockNum);
	}

}
