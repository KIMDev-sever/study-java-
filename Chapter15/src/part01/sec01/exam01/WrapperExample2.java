package part01.sec01.exam01;

public class WrapperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i = 0; i < args.length; i++) {
			Integer obj=new Integer(args[i]);
			total+=obj.intValue();
		}
		System.out.println(total);
		
	}

}
