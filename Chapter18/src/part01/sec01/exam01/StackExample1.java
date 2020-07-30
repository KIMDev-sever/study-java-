package part01.sec01.exam01;

import java.util.LinkedList;

public class StackExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		
		while (!stack.isEmpty()) {
			Integer num=stack.getLast();
			System.out.println(num);
		}
		
	}
}
