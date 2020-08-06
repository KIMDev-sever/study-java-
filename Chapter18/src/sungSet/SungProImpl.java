package sungSet;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class SungProImpl implements SungPro {
	private HashSet set;// 저장할 데이터는 객체
	private Scanner in;

	public SungProImpl() {
		set = new HashSet();
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
		set.add(new SungJuk(name, kor, eng));
	}

	public void initRank() {
		Iterator itr= set.iterator();
		while (itr.hasNext()) {
			SungJuk sungJuk =(SungJuk) itr.next();
			sungJuk.clearRank();
		}
	}

	public void rank() {
		initRank();
		Iterator itr= set.iterator();
		while (itr.hasNext()) {
			SungJuk sungJuk1 =(SungJuk) itr.next();
			Iterator itr2= set.iterator();
			while (itr2.hasNext()) {
				SungJuk sungJuk2 =(SungJuk) itr2.next();
				if (sungJuk1.getTot() < sungJuk2.getTot()) {
					sungJuk1.plusRank();
				}
			}
		}

	}

	@Override
	public void view() {
		rank();
		Iterator itr= set.iterator();
		while (itr.hasNext()) {
			SungJuk sungJuk=(SungJuk) itr.next();
			sungJuk.dis();
		}
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.print("수정할 학생의 이름 입력:");
		String name = in.next();
		Iterator itr= set.iterator();
		SungJuk edit =(SungJuk) itr.next();
		if (edit.getName().equals(name)) {
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
		Iterator itr= set.iterator();
		SungJuk edit =(SungJuk) itr.next();
		if (edit.getName().equals(name)) {
			set.remove(edit);
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
