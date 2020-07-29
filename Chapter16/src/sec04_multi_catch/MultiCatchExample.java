package sec04_multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// TODO: handle exception
			System.out.println("실행매개값의 수가 부족하거나 숫자로 변환할 수 없습니다");	
		}finally {
			System.out.println("다시 실행 하세요");
		}
	}

}
