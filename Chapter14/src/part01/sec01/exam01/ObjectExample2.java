package part01.sec01.exam01;

class GoodsStock {
	String goodscode;
	int stockNum;

	public GoodsStock(String goodscode, int stockNum) {
		// TODO Auto-generated constructor stub
		this.goodscode = goodscode;
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "상품코드:"+this.goodscode+" 재고수량:"+this.stockNum;
	}
}

public class ObjectExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock obj=new GoodsStock("57923",100);
		System.out.println(obj);
//		String str=obj.toString();
//		System.out.println(str);
	}

}
