package in.ds.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ravindra #50DaysofCoding FiFo Example
 */
public class FIFOExample {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(12);
		queue.add(11);
		queue.add(16);
		queue.add(15);
		queue.add(14);

		System.out.println("Initial Queue" + queue);

		for (int i = 0; i <= queue.size(); i++) {
			int deletedElement = queue.remove();
			System.out.println("Removed Element :" + deletedElement);

			System.out.println("Remaining Elements :" + queue);

			int head = queue.peek();
			System.out.println("Element at top :" + head);

			int size = queue.size();
			System.out.println("Final Size of Queue :" + size);
		}
	}

}
