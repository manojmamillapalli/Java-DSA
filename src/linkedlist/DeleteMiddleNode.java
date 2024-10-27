package linkedlist;
import java.util.*;
public class DeleteMiddleNode {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArr2LL(arr);
		printelements(head);
		System.out.println();
		Node head2=deleteMiddleNode(head);
		printelements(head2);

	}
	public static Node convertArr2LL(int[] arr)
	{
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
	public static void printelements(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			System.out.print("->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public static Node deleteMiddleNode(Node head) {
	    if (head == null || head.next == null) {
	        return null; // If there's only one node or the list is empty, return null
	    }

	    Node slow = head;
	    Node fast = head;
	    Node prev = null; // To keep track of the node before slow

	    // Move slow pointer one step and fast pointer two steps until fast reaches the end
	    while (fast != null && fast.next != null) {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Delete the middle node by skipping it
	    if (prev != null) {
	        prev.next = slow.next;
	    }

	    return head;
	}


}
