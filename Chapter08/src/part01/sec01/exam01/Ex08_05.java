package part01.sec01.exam01;

public class Ex08_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = { 10, 20, 30, 40, 50 };
		int count,size;
		count=aa.length;
		size=count*Integer.BYTES;
		System.out.printf("배열의 요소갯수 %d\n",count);
		System.out.printf("배열의 전체크기 %dbytes",size);
	}

}
