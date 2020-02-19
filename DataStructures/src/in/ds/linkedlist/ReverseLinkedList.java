package in.ds.linkedlist;

import java.util.LinkedList;

/**
 * @author Ravindra #50DaysofCoding
 * Reversing a LinkedList
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ravin");
        linkedList.add("shana");
        linkedList.add("venki");
        linkedList.add("raghu");
        System.out.println("Before Reversing :"+ linkedList);

        System.out.println("After Reversing :"+reverseLinkedList(linkedList));

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {
        LinkedList<String> reverseLinkedList = new LinkedList<>();
        for(int i = linkedList.size() -1; i >= 0 ;--i){
            reverseLinkedList.add(linkedList.get(i));
        }
        return reverseLinkedList;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)
