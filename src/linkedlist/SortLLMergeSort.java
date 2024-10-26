package linkedlist;
import java.util.*;
public class SortLLMergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {3,6,2,8,1,9};
		Node head=convertArr2LL(arr);
		head=sortLL(head);
		printele(head);
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
	public static Node findMiddle(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
	 Node slow=head;
	 Node fast=head.next;
	 while(fast!=null && fast.next!=null)
	 {
		 slow=slow.next;
		 fast=fast.next.next;
	 }
	 return slow;
	}
	
	public static Node sortLL(Node head)
	{
		if(head==null || head.next ==null)
		{
			return head;
		}
		Node middle=findMiddle(head);
		Node right=middle.next;
		middle.next=null;
		Node left=head;
		left=sortLL(left);
		right=sortLL(right);
		return sortedLL(left, right);
	}
	
public static Node sortedLL(Node list1, Node list2)
{
	Node dummyhead=new Node(-1);
	Node temp=dummyhead;
	while(list1!=null && list2!=null)
	{
		if(list1.data<=list2.data) {
			temp.next=list1;
			list1=list1.next;
		}
		else
		{
			temp.next=list2;
			list2=list2.next;
		}
		temp=temp.next;
	}
	if(list1!=null)
	{
		temp.next=list1;
	}
	if(list2!=null)
	{
		temp.next=list2;
	}
	return dummyhead.next;
}
public static void printele(Node head)
{
	if(head==null)
	{
		return;
	}
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data);
		System.out.print("->");
		temp=temp.next;
	}
	System.out.println("null");
}
}
