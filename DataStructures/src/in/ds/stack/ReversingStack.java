/**
 * 
 */
package in.ds.stack;

import java.util.Stack;

/**
 * @author Ravindra 
 * #50DaysofCoding
 * Reverse a String using Recursion
 */
public class ReversingStack {

	static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Before reversing" + stack);
		reverse();
		System.out.println("After reversing" + stack);
	}

	private static void reverse() {
		if (stack.size() > 0) {
			Integer x = stack.peek();
			stack.pop();
			reverse();
			insert_to_bottom(x);
		}
	}

	private static void insert_to_bottom(Integer x) {
		if (stack.isEmpty())
			stack.push(x);
		else {
			int a = stack.peek();
			stack.pop();
			insert_to_bottom(x);
			stack.push(a);
		}
	}
}
