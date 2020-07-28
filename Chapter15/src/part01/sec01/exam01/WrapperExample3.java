package part01.sec01.exam01;

public class WrapperExample3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;

		for (int i = 0; i < args.length; i++) {
			
			total += Integer.parseInt(args[i]);
			//문자열을 int타입의 값으로 바꿈
		}
		System.out.println(total);

	}
}
