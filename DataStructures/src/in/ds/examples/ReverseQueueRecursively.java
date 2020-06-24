package in.ds.examples;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursively {

    static Queue<Integer> queue;

    static void print(){
        while(!queue.isEmpty()){
            System.out.println(queue.peek() +" ");
            queue.remove();
        }
    }

    static Queue<Integer> reverseQueue(Queue<Integer> q){
        if(q.isEmpty())
            return q;

        int data = queue.peek();
        q.remove();

        q = reverseQueue(q);
        q.add(data);

        return q;
    }

    public static void main(String[] args) {

        queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println("Before Reversing :"+queue);
        ReverseQueueRecursively.reverseQueue(queue);
        System.out.println("After Reversing :"+queue);



    }
}
