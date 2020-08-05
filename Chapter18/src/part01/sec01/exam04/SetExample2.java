package part01.sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;

class A{}
class B{}
public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs=new HashSet<Object>();
		A ap=new A();
		B bp=new B();
	
		String cp="ABC";
		
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
			
		Iterator<Object> it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
 	}

}
