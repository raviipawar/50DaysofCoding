package in.ds.queue;

import java.util.LinkedList;

/**
 * @author Ravindra #50DaysofCoding 
 * Basic Queue Examples
 */
public class QueueExample {

	LinkedList<Integer> queue;

	public QueueExample() {
		queue = new LinkedList<Integer>();
	}

	// Checking queue is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// size of queue
	public int size() {
		return queue.size();
	}

	// Enqueuing an item
	public void enqueue(int n) {
		queue.addLast(n);
	}

	// Dequeuing an item
	public int dequeue() {
		return (int) queue.remove(0);
	}

	// peek at the first item
	public int peek() {
		return (int) queue.get(0);
	}

	public static void main(String[] args) {
		QueueExample numberQueue = new QueueExample();
		numberQueue.enqueue(5);
		numberQueue.enqueue(6);
		numberQueue.enqueue(7);
		System.out.println("Size of Queue" + numberQueue.size());
		System.out.println("First Out" + numberQueue.dequeue());
		System.out.println("Peek at Second item" + numberQueue.peek());
		System.out.println("Second Out" + numberQueue.dequeue());
		System.out.println("Third Out" + numberQueue.dequeue());

	}
}
