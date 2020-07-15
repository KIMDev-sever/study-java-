package part01.sec01.exam02;

class Avg3 {
	public String name;
	private int avg;// 캡슐화

	// 메소드 오버로딩
	public String average(int kor, int eng) {
		avg = (kor + eng) / 2;
		return name + " 두과목 평균:" + avg;
	}

	public String average(int kor, int eng, int mat) {
		avg = (kor + eng + mat) / 3;
		return name + " 세과목 평균:" + avg;
	}
}

public class AvgTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg3 student1 = new Avg3();
		Avg3 student2 = new Avg3();
		
		student1.name = "김철수";
		student2.name = "김영희";
		String st1_avg = student1.average(70, 80);
		String st2_avg = student2.average(80, 90, 100);

		System.out.println(st1_avg);
		System.out.println(st2_avg);
	}

}
