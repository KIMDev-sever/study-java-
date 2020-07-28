package part01.sec01.exam01;

class Member {
	public String id;

	public Member(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member= (Member) obj;
			return ((Member) obj).id.equals(this.id);
		}
		return false;
	}
}

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다");
		}
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다");
		}
		
	}

}
