package linkedlist;
import java.util.*;
public class PalindromeLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,2,1,3};
		Node head=convertArray2LL(arr);
		System.out.println(palindromeCheck(head));

	}
	public static boolean palindromeCheck(Node head)
	{
		if(head==null || head.next==null)
		{
			return true;
		}
		Node temp=head;
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node secondHead=reverseLLwithoutStack(slow.next);
		Node first=head;
		Node second=secondHead;
		while(second.next!=null)
		{
			if(first.data!=second.data) {
				reverseLLwithoutStack(secondHead);
				return false;
			}
			first=first.next;
			second=second.next;
		}
		reverseLLwithoutStack(secondHead);
		return true;
		
	}
	public static Node convertArray2LL(int[] arr)
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
