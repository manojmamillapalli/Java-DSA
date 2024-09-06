package linkedlist;

public class RemoveNodeAtK {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
        Node head=convertArray2LL(arr);//assign the first element of array to head
        printElements( head);// prints the element of original linkedlist
        Node ans=removeElementAtkthIndex( head,  7);
        printElements( ans);//print the elements of the manipulated LinkedList
        if(ans==null)// returns null if k value is greater or less than the length of the linked list
        {
        	System.out.println("Indexout of bounds");
        }
	}
	//function to convert Array Elements to LinkedList
	public static Node convertArray2LL(int[] arr)
	{
		if(arr.length==0)
			return null;
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
	//function to remove the kth indexed element
	public static Node removeElementAtkthIndex(Node head, int k)
	{
		if(head==null)
			return head;
		int count=0;
		Node temp=head;
		Node prev=null;
		int ans=countLength(head);
		if(k>count || k<count)
		{
			return null;
		}
		if(k==1)
		{
			head=head.next;
		}
		while(temp!=null)
		{
			count++;
			if(count==k)
			{
				prev.next=prev.next.next;
			}
			prev=temp;
			temp=temp.next;
		}
		return head;
	}
	//function to print the elements
	public static void printElements(Node head)
	{
		int count=0;
		Node temp=head;
		 while(temp!=null)
	        {
			    count++;
	        	System.out.print(temp.data+"->");
	        	temp=temp.next;
	        }
	        System.out.print("null");
	        System.out.println();
	}
	//count the length of the linked list
	public static int countLength(Node head)
	{
		int count=0;
		Node temp=head;
		 while(temp!=null)
	        {
			    count++;
	        	
	        	temp=temp.next;
	        }
	       return count;
	}

}
