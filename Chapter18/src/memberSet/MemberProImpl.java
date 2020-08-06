package memberSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MemberProImpl implements MemberPro {
	private HashSet set;
	private Scanner scanner;

	public MemberProImpl() {
		set = new HashSet();
		scanner = new Scanner(System.in);
	}

	@Override
	public void input() {
		System.out.println("이름을 입력:");
		String name = scanner.next();
		System.out.println("전화번호를 입력:");
		String tel = scanner.next();
		Member input = new Member(name, tel);
		set.add(input);
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			Member member = (Member) obj;
			member.disp();
		}
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.print("수정할 회원의 이름을 입력:");
		String name = scanner.next();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			Member member = (Member) obj;
			if (member.getName().equals(name)) {
				System.out.println("현재" + name + "님의 전화번호는 " + member.getTel() + "입니다.");
				System.out.println("수정할 전화번호 입력:");
				String tel = scanner.next();
				member.setTel(tel);// 전화번호 수정
				System.out.println(name + "님의 전화번호를 수정하였습니다.");
				return;
			} else {
				System.out.println(name + "님은 저희 회원이 아닙니다.");
			}

		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 회원의 이름을 입력:");
		String name = scanner.next();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			Member member = (Member) obj;
			if (member.getName().equals(name)) {
				set.remove(member);
				System.out.println(name + "회원님을 삭제하였습니다.");
				return;
			}

		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

}
