package part01.sec01.exam01;

import java.util.Iterator;

public class LunchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object arr[] = new Object[5];
		Object test=new String();
		arr[0]="오렌지"; //String wrapper
		arr[1]=new Integer(52); //interger wrapper
		arr[2]=3.14; //auto boxing double wrapper
		arr[3]=new Character('귤'); //character wrapper
		arr[4]=true; //boolean wrapper
		for (Object value : arr) {
			System.out.println(value);
		}
	}

}
