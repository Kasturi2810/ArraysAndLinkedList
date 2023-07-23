package arrayslinkedlist;
import java.util.*;
class Node {
	public int item;
	public Node next;// pointing to next node
}

public class RemoveDuplicates {
	private int size;
	private Node head;

	public RemoveDuplicates(){
		this.size = 0;
		this.head = null;
	}

	public void insertingnode(int i) {
		Node node = new Node();
		node.item = i;
		Node current = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;	
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.next = null;
			this.size += 1;
		}
	}                                                                   // 2->5->12->2->3->5->1->2->5->5
	                                                                    //  2->5->12->3->1
   public void removeDuplicates() {
		if (this.head == null) {
			System.out.println("linked list is empty");
		}
		ArrayList<Integer> s = new ArrayList<>();
		Node curr = this.head;
		Node prev = null;
		while(curr != null) 
		{
			if(!s.contains(curr.item)) {
				s.add(curr.item);
				prev = curr;
				curr = curr.next;
			}
			else
			{
				prev.next = curr.next;
				curr = curr.next;
			}
		}
		for(int i : s) {
			System.out.print(i +"->");
		}
	}	
	public void traverse() {
		Node current = this.head;
	
		if (this.head == null) {
			System.out.println("linked list is empty");
		}
		
		for (int i = 0; i <= size; i++) {
			System.out.println(current.item);
			current = current.next;
		}

	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates list = new RemoveDuplicates();
		list.insertingnode(2);
		list.insertingnode(5);
		list.insertingnode(12);
		list.insertingnode(2);
		list.insertingnode(3);
		list.insertingnode(5);
		list.insertingnode(1);
		list.insertingnode(2);
		list.insertingnode(5);
		list.insertingnode(5);
		
//		list.traverse();
		list.removeDuplicates();
		}

}
