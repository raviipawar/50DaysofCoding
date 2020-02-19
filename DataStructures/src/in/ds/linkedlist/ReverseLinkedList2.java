package in.ds.linkedlist;

import java.util.LinkedList;

/**
 * @author Ravindra #50DaysofCoding
 * Reversing a LinkedList without using another Linkedlist
 */
public class ReverseLinkedList2 {

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

        System.out.println("After Reversing :"+reverseLinkedList(linkedList));

    }

    private static LinkedList <String> reverseLinkedList(LinkedList<String> linkedList) {

        for(int i = 0; i < linkedList.size() / 2 ; i++) {
            String temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size()-i-1));
            linkedList.set(linkedList.size()-i-1,temp);
        }
        return linkedList;
    }
}

//Time Complexity: O(n/2)
//Space Complexity: O(1)

