package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
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
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("실행매개값의 수가 부족합니다.");
		} catch (Exception e) { //최고 조상이므로 이거 나옴 끝
			// TODO: handle exception
			System.out.println("실행에 문제가 있습니다");
		} finally {
			System.out.println("다시 실행 하세요");
		}
	}

}
