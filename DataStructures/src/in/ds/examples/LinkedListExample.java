package in.ds.examples;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        boolean status = linkedList.contains(22);
        System.out.println(status);

        int x = linkedList.getLast();
        System.out.println(x);

        linkedList.remove(4);

        int y = linkedList.size();
        System.out.println(y);

        int z = linkedList.indexOf(50);
        System.out.println("index :"+z);

        int a = linkedList.peek();
        System.out.println(a);
    }

}
