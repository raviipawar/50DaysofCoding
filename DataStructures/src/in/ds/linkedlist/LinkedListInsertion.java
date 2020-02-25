package in.ds.linkedlist;

/**
 * @author Ravindra #50DaysofCoding 
 * LinkedList Insertion 
 */
public class LinkedListInsertion {

	static class Node {
		int data;
		Node next;
		Node head;

		public Node(int data2) {
		}

		//Insertion at the beginning
		public void push(int data) {

			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
		}
		
		//Insertion after a given node
		public void insertAfter(Node prev_node, int new_data){
			
			if(prev_node == null){
			
			System.out.println("Previous node cannot be null");
			return;
			}	

			Node new_node = new Node(new_data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;

		}
		
		//Inserion at the end
		public void append(int new_data){
			
			Node new_node = new Node(new_data);
			if(head == null)
				{
				head = new Node(new_data);
				return;
				}

			new_node.next = null;
			Node last = head;
			
			while(last.next != null)
			last = last.next;
			return;

		}


	}
}
