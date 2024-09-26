package linkedlist;
import java.util.*;
public class AdditionOfLinkedLists {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2LL(arr);
		Node root=convertArray2LL(arr1);
        Node newNode=addElements(head, root);
        printelements(newNode);
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
public static void printelements(Node head)
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		System.out.print("->");
		temp=temp.next;
	}
	System.out.print("null");
	System.out.println();
}

public static Node addElements(Node head1, Node head2)
{
	Node dummy=new Node(-1);
	Node current=dummy;
	Node temp1=head1;
	Node temp2=head2;
	int carry=0;
	while(temp1!=null || temp2!=null)
	{
		int sum=carry;
		if(temp1 != null)
		{
			sum+=temp1.data;
		}
		if(temp2 != null)
		{
			sum+=temp1.data;
		}
		Node newnode=new Node(sum%10);
		carry=sum/10;
		current.next=newnode;
		current=newnode;
		if(temp1 != null)
		{
			temp1=temp1.next;
		}
		if(temp2 != null)
		{
			temp2=temp2.next;
		}
		if(carry!=0)
		{
			Node newNode=new Node(carry);
			current.next=newNode;
		}
	}
	return dummy.next;
}
}
