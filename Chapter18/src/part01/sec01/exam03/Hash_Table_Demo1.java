package part01.sec01.exam03;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_Table_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
		
		hashtable.put(10, "Java");
		hashtable.put(15, "Spring");
		hashtable.put(20, "JSP");
		hashtable.put(25, "JavaScript");
		hashtable.put(30, "Python");
		
		System.out.println("The Table is:"+ hashtable);
		
		Enumeration enu=hashtable.keys();
		System.out.println("The enumeration of keys are");
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
	}

}
