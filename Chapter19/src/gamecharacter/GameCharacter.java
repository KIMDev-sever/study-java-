package gamecharacter;

import java.util.ArrayList;

public class GameCharacter {
	private class GameItem {
		String name;
		int type;
		int price;

		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "GameItem [name=" + name + ",type=" + type + ",price=" + price + "]";
		}
	}

	private ArrayList<GameItem> list = new ArrayList<GameItem>();

	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		list.add(item);
	}
	public void print() {
		int total=0;
		for (GameItem gameItem : list) {
			System.out.println(gameItem);
			total+=gameItem.getPrice();
		}
		System.out.println(total);
	}
}
