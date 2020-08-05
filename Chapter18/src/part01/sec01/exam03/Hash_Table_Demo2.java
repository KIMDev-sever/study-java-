package part01.sec01.exam03;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_Table_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

		hashtable.put("Java", 10);
		hashtable.put("Spring", 15);
		hashtable.put("JSP", 20);
		hashtable.put("JavaScript", 25);
		hashtable.put("Python", 30);

		System.out.println("The Table is:" + hashtable);

		Enumeration enu = hashtable.keys();
		System.out.println("The enumeration of keys are");

		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}
	}

}
