package part01.sec01.exam02;

public class Numbers {
	int num[];

	public Numbers(int num[]) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int i : num) {
			total += i;
		}
		return total;
	}

	int getAverage() {
		int total = getTotal();
		int average = total / num.length;
		return average;
	}
}
