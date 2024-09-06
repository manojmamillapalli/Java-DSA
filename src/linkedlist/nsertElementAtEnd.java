package linkedlist;

public class nsertElementAtEnd {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		 Node  head=convertArray2LL(arr);//assign the first element of array to head
	        printElements( head);// prints the element of original linkedlist
	        Node ans=addAtTail( head, 1000);
	        printElements( ans);//print the elements of the manipulated LinkedList

	}
	//function to add the element before the head
	public static Node addAtTail(Node head, int value)
	{
		Node temp=head;
		Node temp1=new Node(value);
		while(temp.next!=null)
		{
			temp=temp.next;
			if(temp.next==null)
			{
				temp.next=temp1;
				temp1.next=null;
			}
		}
		return head;
		
		
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
	//function to print the elements
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
