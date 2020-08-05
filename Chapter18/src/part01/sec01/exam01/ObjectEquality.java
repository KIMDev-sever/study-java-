package part01.sec01.exam01;

class IntNumber{
	int num;
	
	public IntNumber(int num) {
		this.num=num;
		
	}
//	public boolean isEquals(Object obj) {
//		if(obj instanceof IntNumber)  {
//			IntNumber newobj=(IntNumber)obj;
//			
//		if(newobj.num==this.num)   
//			 return true; 
//		}
//		return false;
//		
//	}
//
	
	public boolean isEquals(IntNumber number) {
		if(number.num==this.num) {
			return true;
		}else 
			return false;
	}
	
}

public class ObjectEquality {

	public static void main(String[] args) {
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		
		if(num1.isEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}else {
			System.out.println("num1과 num2는 다른 정수");
			
		}
		if(num1.isEquals(num3)) {
			System.out.println("num1과 num3과 동일한 정수");
		}else {
			System.out.println("num1과 num3과 다른 정수");
		}
		
	}

}
