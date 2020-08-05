package part01.sec01.exam02;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberProImpl implements MemberPro {
	private Hashtable map;// 동시 접근 불가 실행 이 안된다.
	private Scanner in;

	public MemberProImpl() {
		map = new Hashtable();// 자료를 저장하는 라이브러리
		in = new Scanner(System.in);

	}

	public void input() {
		String name;
		while (true) {
			System.out.print("이름을 입력:");
			name = in.next();

			if (map.containsKey(name)) {// 해당되는 키 값이 있는가?
				System.out.println(name + "회원님은 존재합니다.다시 입력해주세요!!");

			} else {
				break;
			}
		}

		System.out.print("전화번호를 입력:");
		String tel = in.next();
		
		

		Member input = new Member(name, tel);
		map.put(name, input);//위에서 만든 이름과 전화번호를 해쉬테이블안에서 데이터값으로 불러오다.

	}

	public void view() {// 해시테이블에 잇는 내용을 보는것
			Enumeration enu =  map.keys(); // iterator의 구버전 으로 // 안에 있는 데이터를 가져올때 사용
			while (enu.hasMoreElements()) {// 데이터를 있느냐 없는냐를 체크
			Object obj = enu.nextElement(); // 가져오는 타입이 Object obj 타입임 .데이터를 가져옴
			String key = (String) obj; // Key 는 string 타입이기 때문에 캐스팅해서 값을 가져온다.
			Member view = (Member) map.get(key);
			// Object obj2=map.get(key);
			// Member view=(Member)obj2;
				view.disp();
		}
		
	}

	public void edit() {
		System.out.print("수정할 회원의 이름을 입력:");
		String name = in.next();
		if (map.containsKey(name)) {
			Object obj = map.get(name);//하나의 객체
			Member edit = (Member) obj;
			System.out.println("현재" + name + "님의 전화번호는 " + edit.getTel() + "입니다.");
			System.out.println("수정할 전화번호 입력:");
			String tel = in.next();
			edit.setTel(tel);// 전화번호 수정
			System.out.println(name + "님의 전화번호를 수정하였습니다.");
			return;
		} else {
			System.out.println(name + "님은 전희 회원이 아닙니다.");
		}
	}

	public void delete() {
		System.out.print("삭제할 회원의 이름을 입력:");
		String name = in.next();

		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name + "회원님을 삭제하였습니다.");
			return;
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
	}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
