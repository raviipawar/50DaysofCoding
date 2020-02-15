/**
 * 
 */
package in.ds.stack;

import java.util.Stack;

/**
 * @author Ravindra #50DaysofCoding 
 * Reverse String using stack
 */
public class ReverseStringUsingStack {

	int size;
	int top;
	char[] ch;

	boolean isEmpty() {
		return top < 0;
	}

	ReverseStringUsingStack(int n) {
		top = -1;
		size = n;
		ch = new char[size];
	}

	boolean push(char x) {
		if (top >= size) {
			System.out.println("Stack Overflow Condition");
			return false;
		} else {
			ch[++top] = x;
			return true;
		}
	}

	char pop() {
		if (top < 0) {
			System.out.println("Stack Underflow Condition");
			return 0;
		} else {
			char x = ch[top--];
			return x;
		}
	}

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("50daysofcoding");
		System.out.println("Before Reversing  :" +s);
		reverse(s);
		System.out.println("String after reversing  :" + s);
	}

	public static void reverse(StringBuffer s) {

		int size = s.length();
		Stack<Character> obj = new Stack<Character>();

		for (int i = 0; i < size; i++) {
			obj.push(s.charAt(i));
		}
		for (int i = 0; i < size; i++) {
			char ch = (char) obj.pop();
			s.setCharAt(i, ch);
		}
	}

}
