package part01.sec01.exam01;

import java.util.LinkedList;

public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>();
		/* 
		 * Queue FIFO(first in First Out)
		 * offer(): Queue에 삽입
		 *  poll(): Queue에서 제거하며 읽기 
		 *  peek(): Queue에서 제거하지 않고 읽기
		 */
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");

		while (!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}

	}

}
