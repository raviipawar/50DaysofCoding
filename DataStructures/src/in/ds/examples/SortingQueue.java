package in.ds.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SortingQueue {

    static Queue<Integer> queue;

    static void sortQueue(){
        if(queue.isEmpty())
            return;

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < queue.size();i++){
            int data = queue.peek();
            al.add(data);
            System.out.println(al);
        }
        al.sort(Integer::compareTo);

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

        sortQueue();
    }
}
