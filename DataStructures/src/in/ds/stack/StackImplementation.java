/**
 * 
 */
package in.ds.stack;

import java.util.EmptyStackException;

/**
 * @author Ravindra #50DaysofCoding 
 * Stack Implementation 
 */

public class StackImplementation {

	private static class Stack<T>{
		private int data;
		private Stack<Integer> next;
		
		public Stack(Integer data) {
			this.data =(int) data;
		}
	}
	private Stack<Integer> top ;

	public int pop() {
		if(top==null) throw new EmptyStackException();
		Integer item  = top.data;
		top= top.next;
		return item;
	}
	
	public void push(Integer item) {
		Stack<Integer> stack = new Stack<Integer>(item);
		stack.next= top;
		top = stack;
	}
	
	public int peek() {
		if(top==null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null ;
	}
}
