package play;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class PlayProImpl implements PlayPro {
	private Hashtable<String, Hashtable<String, Player>> ht;
	private Scanner in;

	public PlayProImpl() {
		// TODO Auto-generated constructor stub
		ht = new Hashtable<String, Hashtable<String, Player>>();
		String data[] = new String[] { "한화", "LG", "기아", "롯데" };
		for (int i = 0; i < data.length; i++) {
			ht.put(data[i], new Hashtable<String, Player>());
		}
		한화 data
		엘지 data
		기아 data
		롯데 data
		in = new Scanner(System.in);
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("구단을 입력:");
		String club = in.next(); 한화
		Hashtable<String, Player> ht2 = ht.get(club);
		System.out.print("선수 이름을 입력:");
		String name = in.next();
		System.out.print("연봉을 입력:");
		int salary = in.nextInt();
		ht2.put(name, new Player(name, club, salary));
		ht.put(club, ht2);
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("구단을 입력");
		String club = in.next();

		Hashtable<String, Player> ht2=ht.get(club);
		Enumeration<Player> enu=ht2.elements();
		while (enu.hasMoreElements()) {
			Player player = (Player) enu.nextElement();
			player.disp();
			
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("구단을 입력");
		String club = in.next();

		Hashtable<String, Player> ht2=ht.get(club);
		System.out.print("삭제할 선수의 이름을 입력:");
		String name = in.next();
		if(ht2.containsKey(name)) {
			ht2.remove(name);
			System.out.print(club+"구단의"+name+"선수를 삭제하였습니다.");
		}else {
			System.out.print(club+"구단에는"+name+"선수가 없습니다.");
		}

	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.print("구단을 입력");
		String club = in.next();

		Hashtable<String, Player> ht2=ht.get(club);
		System.out.print("타구단으로 옮길 선수의 이름:");
		String name = in.next();
		if(ht2.containsKey(name)) {
			System.out.print("옮길 구단의 이름을 입력");
			String club2 = in.next();
			Hashtable<String, Player> ht3=ht.get(club2);
			ht3.put(name,ht2.get(name));
			ht.put(club2,ht3);
			ht2.remove(name);
		}

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

}
