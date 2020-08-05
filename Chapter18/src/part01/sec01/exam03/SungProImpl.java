package part01.sec01.exam03;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class SungProImpl implements SungPro {
	private Hashtable<String, SungJuk> map;// 저장할 데이터는 객체
	private Scanner in;

	public SungProImpl() {
		map = new Hashtable<>();
		in = new Scanner(System.in);

	}

	public int input(String str) {
		int sub;
		while (true) {
			System.out.print(str + "과목의 점수를 입력:");
			sub = in.nextInt();// 점수를 입력 받아 각 과목의 점수 범위 체크(0점~100점)
			if (0 > sub || sub < 100) {
				break;
			} else {
				System.out.println(str + "과목의 점수는 0점에서 100점 사이값만 넣어주세요!");
			}
		}
		return sub;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("이름을 입력:");
		String name = in.next();
		int kor = input("국어");
		int eng = input("영어");
		map.put(name, new SungJuk(name, kor, eng));
	}

	public void initRank() {
		for (Enumeration<String> enu1 = map.keys(); enu1.hasMoreElements();) {
			String key1 = enu1.nextElement();
			SungJuk sunjuk1 = map.get(key1);
			sunjuk1.clearRank();
		}
	}

	public void rank() {
		initRank();
		for (Enumeration<String> enu1 = map.keys(); enu1.hasMoreElements();) {
			String key1 = enu1.nextElement();
			SungJuk sunjuk1 = map.get(key1);
			for (Enumeration<String> enu2 = map.keys(); enu2.hasMoreElements();) {
				String key2 = enu2.nextElement();
				SungJuk sunjuk2 = map.get(key2);
				if (sunjuk1.getTot() < sunjuk2.getTot()) {
					sunjuk1.plusRank();
				}
			}
		}
	}

	@Override
	public void view() {
		rank();
		Enumeration<String> enu = map.keys();
		while (enu.hasMoreElements()) {
			String key = enu.nextElement();
			map.get(key).dis();
		}
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.print("수정할 학생의 이름 입력:");
		String name = in.next();
		SungJuk edit = map.get(name);
		if (map.containsKey(name)) {
			System.out.println(name + "님의 현재 국어 점수는" + edit.getKor() + "입니다.");
			edit.setKor(input("수정할 국어"));
			System.out.println(name + "님의 현재 영어 점수는" + edit.getEng() + "입니다.");
			edit.setEng(input("수정할 영어"));
			edit.setTot();
			System.out.println(name + "학생의 성적을 수정하였습니다.");
			return;
		}
		System.out.println(name + "님은 저희 학생이 아닙니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 학생의 이름 입력:");
		String name = in.next();
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name + "의 성적이 삭제 되었습니다.");
		}
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
