package linkedlist;
import java.util.*;
public class InsertBeforeValue {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArrayToLL(arr);// converting array to linked list
		printElements(head);//printing the elements before the manipulation
		Node head1=insertBeforeValue(head,8,10);//updated head if the element is inserted before the head
		printElements(head1);//printing the elements after manipulation
	}
	//function to insert the element before the particular value
	public static Node insertBeforeValue(Node head, int value, int element)
	{
		Node temp=head;
		Node temp1=new Node(element);
		if(head.data==value)
		{
			temp1.next=head;
			return temp1;
		}
		while(temp.next!=null)
		{
		if(temp.next.data==value)
		{
			temp1.next=temp.next;
			temp.next=temp1;
			break;
		}
		temp=temp.next;
		}
		return head;
		
	}
	//function to convert array to LL
public static Node convertArrayToLL(int[] arr)
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
//function to count length of the LL
public static int countLength(Node head)
{
	int count=0;
	Node temp=head;
	while(temp.next!=null)
	{
		count++;
		temp=temp.next;
	}
	return count;
}
//Function to print tle LL
public static void printElements(Node head)
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
}
