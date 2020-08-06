package play;

public class Player {
	private String name;
	private String club;
	private int salary;

	public Player(String name, String club, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.club = club;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void disp() {
		System.out.println(name + "님의 연봉은" + salary + "원 입니다.");
	}

}
