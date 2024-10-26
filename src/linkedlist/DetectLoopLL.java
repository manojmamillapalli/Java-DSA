package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DetectLoopLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		Node head=formCycle(arr, 3);
		//Node head=convertArr2LL(arr);
		//printElements(head);
        System.out.println(detectCycle(head));
        System.out.println(detectCycleUsingTortoise(head));
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
	public static Node formCycle(int[] arr, int pos)
	{
		 if (arr.length == 0) return null;  // Handle empty array

	        Node root = new Node(arr[0]);  // Initialize root node
	        Node mover = root;
	        Node cycleNode = null;

	        // Create the linked list and track the cycle position
	        for (int i = 1; i < arr.length; i++) {
	            Node temp = new Node(arr[i]);
	            mover.next = temp;
	            mover = temp;

	            // Track the node where we want to create a cycle
	            if (i == pos) {
	                cycleNode = mover;
	            }
	        }

	        // If pos >= 0, create a cycle by linking last node to the cycle start node
	        if (pos >= 0) {
	            mover.next = (pos == 0) ? root : cycleNode;
	        }

	        return root;
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
public static boolean detectCycle(Node head)
{
	Node temp=head;
	Map<Node, Integer> map=new HashMap<Node, Integer>();
	while(temp!=null)
	{
		if(map.containsKey(temp))
		{
			return true;
		}
		map.put(temp, 1);
		temp=temp.next;
	}
	return false;
	
}
public static boolean detectCycleUsingTortoise(Node head)
{
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast)
		{
			return true;
		}
	}
	
	
		return false;
		
		
}
}
