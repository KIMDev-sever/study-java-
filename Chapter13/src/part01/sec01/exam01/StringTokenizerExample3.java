package part01.sec01.exam01;

import java.util.StringTokenizer;

public class StringTokenizerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stok = new StringTokenizer("사과=10|초콜릿=3|샴폐인=1", "=|", true);
		while (stok.hasMoreTokens()) {
			// hasMoreTokens 분류할 데이터가 있느냐?
			String str = stok.nextToken();

			if (str.equals("=")) {
				str = "\t";
			} else if (str.equals("|")) {
				str = "\n";
			}
			System.out.printf(str);
		}
	}

}
