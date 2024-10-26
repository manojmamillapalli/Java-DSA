package linkedlist;
import java.util.*;
import linkedlist.ConvertArray2LL;
public class AddAlternateLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		Node head=convertArray2LL(arr);
		Node[] arr1=new Node[2];
		arr1=alternate(head);
		System.out.println("SUCCESSFULLY ALTERED....");
		Node temp=arr1[0];
		
	    while(temp!=null)
	    {
	    	System.out.print(temp.data);
	    	System.out.print("->");
	    	temp=temp.next;
	    }
	    	Node temp1=arr1[1];
	    	 while(temp1!=null)
	 	    {
	 	    	System.out.print(temp1.data);
	 	    	System.out.print("->");
	 	    	temp1=temp1.next;
	 	    }

	}
	private static Node convertArray2LL(int[] arr) {
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
	public static Node[] alternate(Node head)
	{
		Node[] arr=new Node[2];
		Node current=head;
		boolean alternate=true;
		Node aHead=null;
		Node aTail=null;
		Node bHead=null;
		Node bTail=null;
		if(head==null)
		{
			arr[0]=null;
			arr[1]=null;
			return arr;
		}
		while(current!=null)
		{
			if(alternate)
			{
				if(aHead==null)
				{
					aHead=current;
					aTail=aHead;
				}
				else
				{
					aTail=current;
					aTail=aTail.next;
				}
			}
			else
			{
				if(bHead==null)
				{
					bHead=current;
					bTail=bHead;
				}
				else
				{
					bTail=current;
					bTail=bTail.next;
				}
			}
			alternate=!alternate;
			current=current.next;
			
		}
		if(aTail!=null)
		{
			aTail=null;
		}
		if(bTail!=null)
		{
			bTail=null;
		}
		arr[0]=aHead;
		arr[1]=bHead;
		return arr;
		
	}

}
