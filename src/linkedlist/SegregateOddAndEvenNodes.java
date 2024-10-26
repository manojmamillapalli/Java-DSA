package linkedlist;
import java.util.*;
public class SegregateOddAndEvenNodes {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		Node head=convertArr2LL(arr);
		Node newhead=OddFirstEvenNext(head);
		printElements(newhead);
		Node anothernode=EvenElementsFirstAndOddElementsNext(newhead);
		printElements(anothernode);

	}
	//---------------procedure to make the odd indexed elements at first and even indexed elements at last.............
	//first create a node that points to the head and that node travers all the odd nodes
	// create another node that points to the head.next that traverse all the even nodes 
	// create one dummy evennode so that at last we need to point the last odd node to the first even node
	//  make an while loop and shift the next of the each odd and even heads to the next.next
	// and finally make the oddhead.next to the evenhead
	// return the original head
	
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
	
	public static Node OddFirstEvenNext(Node head)
	{
		Node oddhead=head;
		Node evenhead=head.next;
		Node dummyevenhead=evenhead;
		while(oddhead.next!=null && evenhead.next!=null)
		{
			oddhead.next=oddhead.next.next;
			evenhead.next=evenhead.next.next;
			evenhead=evenhead.next;
			oddhead=oddhead.next;
		}
		oddhead.next=dummyevenhead;
		return head;
	}
	public static void printElements(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			System.out.print("->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static Node EvenElementsFirstAndOddElementsNext(Node head) {
	    Node current = head;
	    
	    Node evenhead = new Node(-1); // Dummy node for even list
	    Node eventail = evenhead;     // Tail pointer for even list
	    
	    Node oddhead = new Node(-1);  // Dummy node for odd list
	    Node oddtail = oddhead;       // Tail pointer for odd list
	    
	    while (current != null) {
	        Node temp = current;
	        current = current.next;
	        temp.next = null; // Disconnect the node from the original list
	        
	        if (temp.data % 2 == 0) {
	            // Append to the even list
	            eventail.next = temp;
	            eventail = temp;
	        } else {
	            // Append to the odd list
	            oddtail.next = temp;
	            oddtail = temp;
	        }
	    }
	    
	    // Connect the even list to the odd list
	    eventail.next = oddhead.next;
	    
	    // Return the head of the new list (skip the dummy evenhead node)
	    return evenhead.next;
	}


}
