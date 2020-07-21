package part01.sec01.exam03;

import java.io.IOException;
import java.util.Scanner;

class Member2 {
	protected String name;
	protected String tel;

	public Member2(String name, String tel) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void disp() {
		System.out.println(name + "님의 전화번호는" + tel + "번입니다.");
	}
}

class Member3 extends Member2 {
	private String addr;

	public Member3(String name, String tel, String addr) {
		super(name, tel);
		this.addr = addr;
		// TODO Auto-generated constructor stub
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(name + "님의 전화번호는" + tel + "번이고, 주소는 " + addr + "입니다");
	}

}

class MemberPro {
	private Member3 members[];
	private int po;
	private int increment = 3;
	Scanner scanner = new Scanner(System.in);

	public MemberPro() {
		members = new Member3[5];
		this.po = 0;

		// TODO Auto-generated constructor stub
	}

	public void input() {
		System.out.println("이름을 입력하시오");
		String name = scanner.next();
		System.out.println("전화번호를 입력하시오");
		String tel = scanner.next();
		System.out.println("주소를 입력하시오");
		String addr = scanner.next();
		members[po] = new Member3(name, tel, addr);
		this.po++;
		if (po == members.length) {
			Member3 members2[] = new Member3[members.length + increment];
			for (int i = 0; i < members.length; i++) {
				members2[i] = members[i]; // 복사
			}
			members = members2;
		}
	}

	public void view() {
		for (int i = 0; i < po; i++) {
			members[i].disp();
		}

	}

	public void delete() {
		System.out.println("삭제할 회원의 이름을입력:");
		String name = scanner.next();
		for (int i = 0; i < po; i++) {
			if (name.equals(members[i].getName())) {
				for (int j = i; j < (po - 1); j++) {
					members[i] = members[j + 1];
				}
				System.out.println(name + "회원님을 삭제하였습니다");
				return;
			}
			if(i==(po-1)) {
				members[i]=new Member3("", "", "");
			}
		}
		System.out.println(name + "님은 저희 회원이아닙니다.");

	}

	public void edit() {
		System.out.println("수정할 회원의 이름을입력:");
		String name = scanner.next();
		for (int i = 0; i < po; i++) {
			if (name.equals(members[i].getName())) {
				System.out.println("현재" + name + "회원님의 전화번호는" + members[i].getTel() + "입니다");
				System.out.print("수정할 전화번호:");
				String tel = scanner.next();
				members[i].setTel(tel);
				System.out.println("현재" + name + "회원님의 전화번호는" + tel + "입니다");
			}
		}
		System.out.println(name + "님은 저희 회원이아닙니다.");
	}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}

public class Exam_12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MemberPro memberPro = new MemberPro();
		while (true) {
			System.out.println("1.입력 2.출력 3.삭제 4.수정 5.종료");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch (select) {
			case 1:
				memberPro.input();
				break;
			case 2:
				memberPro.view();
				break;
			case 3:
				memberPro.delete();
				break;
			case 4:
				memberPro.edit();
				break;

			case 5:
				memberPro.exit();
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}

	}

}
