package part01.sec01.exam01;
/*
 * 1.인터페이스의 역할에 대해서 기술하시오
 * 2.인터페이스의 구성요소를 나열하시오
 *	
 */
interface Car11 {
	abstract void work();
}

interface Cannon {
	abstract void fire();
}
 
class Tank implements Cannon, Car11 {

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("대포발사");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 움직임");
	}

}

public class Ex11_11 {

	public static void main(String[] args) {
		Tank tank1=new Tank();
		tank1.work();
		tank1.fire();
	}
}
