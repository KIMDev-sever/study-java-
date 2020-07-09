package part01.sec01.exam01;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = { 100, 200, 300, 400 };
		int bb[] = new int[] { 100, 200, 300 };
		int cc[];
		cc = new int[] { 100, 200 };
		int[] dd = new int[1];
		dd[0] = 100;
		for (int i = 0; i < 4; i++) {
			System.out.print(aa[i]);
		}
		System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.print(bb[i]);
		}
		System.out.println();
		for (int i = 0; i < cc.length; i++) {
			System.out.print(bb[i]);
		}
		System.out.println();
		System.out.print(dd[0]);
	}

}
