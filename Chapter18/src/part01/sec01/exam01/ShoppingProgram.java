package part01.sec01.exam01;

import java.util.LinkedList;

class CartItem {
	String code;
	int num;
	int price;

	public CartItem(String code, int num, int price) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.num = num;
		this.price = price;
	}
}

public class ShoppingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<CartItem> list = new LinkedList<CartItem>();
		list.add(new CartItem("50001", 2, 2000));
		list.add(new CartItem("73505", 1, 7000));
		list.add(new CartItem("88012", 3, 2500));
		//
		list.remove(1);
		System.out.println("상품코드 수량 가격");
		System.out.println("----------------------");
		
		for (CartItem cartItem : list) {
			System.out.printf("%5s %8d %8d %n",cartItem.code,cartItem.num,cartItem.price);
		}
		
	}	

}
