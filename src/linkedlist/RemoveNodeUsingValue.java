package linkedlist;

public class RemoveNodeUsingValue {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
        Node head=convertArray2LL(arr);//assign the first element of array to head
        printElements( head);// prints the element of original linkedlist
        Node ans=removeElementAtkvalue( head,  10);
        printElements( ans);//print the elements of the manipulated LinkedList
        if(ans==null)// returns null if k value does not exists in the linked list
        {
        	System.out.println("Element not present in the Linked List");
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
	//function to remove the k value element
	public static Node removeElementAtkvalue(Node head, int k)
	{
		if(head==null)
			return head;
		int count=0;
		Node temp=head;
		Node prev=null;
		int ans=countLength(head);
		while(temp!=null)
		{
			if(temp.data==k)
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
