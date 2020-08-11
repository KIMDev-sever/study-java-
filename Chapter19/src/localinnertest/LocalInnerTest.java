package localinnertest;

class LocalInner{
	private int data=30;
	void display() {
		final String msg="현재의 데이터 값은:";
		class Local{
			void printMsg() {
				System.out.println(msg+data);
			}
		}
		Local obj=new Local();
		obj.printMsg();
	}

}
public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner localInner=new LocalInner();
		localInner.display();
	}

}
