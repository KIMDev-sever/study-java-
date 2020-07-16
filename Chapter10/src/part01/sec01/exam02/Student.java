package part01.sec01.exam02;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int mat;
	int getTotal() {
		return kor + eng + mat;
	}

	float getAverage() {
		return (int) (getTotal() / 3);
	}
}
