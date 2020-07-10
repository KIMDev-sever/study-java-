package part01.sec01.exam02;

public class SalesRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][] = { { 90, 10, 110, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				sum += intArray[i][j];
			}
			
		}
		System.out.println("3년간 총액:"+sum+"이며 연평균 매출은"+sum/intArray.length);
	}

}
