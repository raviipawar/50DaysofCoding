package in.ds.examples;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLLUsingCollection {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ravin");
        linkedList.add("shana");
        linkedList.add("venki");
        linkedList.add("raghu");
        linkedList.add("ramesh");
        linkedList.add("lucky");
        linkedList.add("tarun");

        System.out.println("Before Reversing :"+ linkedList);

        Collections.reverse(linkedList);

        System.out.println("After Reversing :"+linkedList);
    }
}

//Time Complexity: O(n/2)
//Space Complexity: O(1)
