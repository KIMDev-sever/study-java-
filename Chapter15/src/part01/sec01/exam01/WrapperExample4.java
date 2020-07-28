package part01.sec01.exam01;

public class WrapperExample4 {
	public static void main(String[] args) {
		Integer obj=new Integer("10");
		int sum=obj+20; // auto Unboxingl
		System.out.println(sum);
	}
}
