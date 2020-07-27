package part01.sec01.exam01;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTokenizer를 이용해서 문자열로부터 토큰을 분리
		StringTokenizer stok=new StringTokenizer("사과 배 복숭아");
		while (stok.hasMoreTokens()) {
			//hasMoreTokens 분류할 데이터가 있느냐?
			String str=stok.nextToken();
			System.out.println(str);
		}
	}

}
