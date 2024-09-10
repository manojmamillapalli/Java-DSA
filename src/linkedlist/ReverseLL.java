package linkedlist;

import java.util.Stack;

public class ReverseLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Node head=convertArray2LL(arr);
		printele(head);
//		reverseLL(head);
//		printele(head);
		Node front=reverseLLwithoutStack( head);
		printele(front);
	}
	public static Node convertArray2LL(int[] arr) {
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
	public static void printele(Node head)
	{
		Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
	}
	public static void reverseLL(Node head)
	{
		Stack<Integer> st=new Stack<>();// create a stack to store the elements of an original LL
		Node temp=head;
		while(temp!=null)
		{
			st.push(temp.data);//pushing the elements of a LL starting from head
			temp=temp.next;
		}
		temp=head;// again reassign head to temp
		while(temp!=null)
		{
			temp.data=st.peek();//override the stack elements on the existing LL
			st.pop();
			temp=temp.next;
		}
		// this process takes O(N) time complexity and N space complexity because 
		//we created an extra stack
	}
	public static Node reverseLLwithoutStack(Node head)
	{
		//step1 create temp and assign it to head
		//step2 create prev node and assign it to null
		//while loop
		//step3 create front and make to to temp.next
		//assign temp.next to prev
		//prev to temp
		//temp to front;
		
		Node temp=head;
		Node prev=null;
		while(temp!=null)
		{
			Node front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		return prev;
		
	}

}
