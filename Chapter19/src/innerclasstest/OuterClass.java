package innerclasstest;

public class OuterClass {
	private int value=10;
	
	public OuterClass() {
		// TODO Auto-generated constructor stub
		InnerClass obj=new InnerClass();
		obj.myMethod();
	}
	class InnerClass{
		public void myMethod() {
			System.out.println("외부 클래스의 private");
		}
	}
}
