package part01.sec01.exam02;

public class Member {
	protected String name;
	protected String tel;

	Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
	void disp() {
		System.out.println(name+"님의 전화번호는"+tel+"번 입니다");  
	}

}