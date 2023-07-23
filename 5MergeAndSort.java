package arrayslinkedlist;
import java.util.*;

public class MergeAndSort{
	private static  Node head1,head2;
	static class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
			}
	}
 
		//inserting nodes
	  public static Node insert(Node head,int data) {
		Node node = new Node(data);
		Node current = head;
		
		if (current == null) {
			head = node;
			head.next=null;
		} else {
			while (current.next != null) {
				current = current.next;

			    
			}
			current.next = node;
			node.next = null;
		}
		
		return head;
	}
 
	   //merge
	public static Node merge(Node head1,Node head2) {
		Node curr = head1;
		if(head1 == null || head2 == null) {
			System.out.println("List is Empty");
		}
		else
		{
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = head2;
		}
		return head1;
	}
 
	// sorting
	public static Node sort(Node head1) {
		Node curr1 = head1;
		Node curr2 = null;
		int temp;
		if(head1 == null ) {
			System.out.println("List is Empty");
		}
		else
		{
			while(curr1 != null) {
				curr2 = curr1;
				while(curr2 != null) {
					if(curr2.data <= curr1.data) {
						temp = curr1.data;
						curr1.data = curr2.data;
						curr2.data = temp;
					}
					curr2= curr2.next;
				}
				curr1 = curr1.next;
			}
		}
		return head1;
	}
	
	// traverse
	 public static void traverse(Node head) {
		Node current = head;
	   
		if (current == null) {
			System.out.println("linked list is empty");
		}
		
		while(current != null) {
			System.out.print(current.data+ "->");
			current = current.next;
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		int val1[] = {25,35,12,4,36,48};
		head1 = null;
		for(int i = 0;i<val1.length;i++) {
			head1 = insert(head1,val1[i]);
			//System.out.println(val1[i]);
		}
		
		int val2[] = {8,32,22,45,63,49};
		head2 = null;
		for(int i = 0;i<val2.length;i++) {
			head2 = insert(head2,val2[i]);
		}
	System.out.print("LinkedList1: ");
    traverse(head1);
   
    
    System.out.print("LinkedList2: ");
    traverse(head2);
   
    
  System.out.print("LinkedList After Merge: ");
	merge(head1,head2);
	traverse(head1);
	
	
	System.out.print("LinkedList After Sorting: ");
	sort(head1);
	traverse(head1);
	}

}
