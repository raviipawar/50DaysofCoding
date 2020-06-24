package in.ds.examples;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElements {

    static Queue<Integer> queue;

    static void reverse_K_elements(int k) {
        if (queue.isEmpty() == true || k > queue.size())
            return;
        if (k <= 0)
            return;

        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
        static void print(){
            while(!queue.isEmpty()){
                System.out.println(queue.peek()+" ");
                queue.remove();
            }
        }

    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        reverse_K_elements(k);
        print();
    }
}
