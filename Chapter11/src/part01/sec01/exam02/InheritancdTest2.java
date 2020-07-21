package part01.sec01.exam02;

class AA {
	int i;
	private int j;

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class BB extends AA {
	int total;

	void sum() {
		//total = i + j;
	}
}

public class InheritancdTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB subOb=new BB();
		subOb.sum();
	}

}
