package linkedlist;

public class InsertElementAtPositionK {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		 Node head=convertArray2LL(arr);//assign the first element of array to head
	        printElements( head);// prints the element of original linkedlist
	        Node ans=addAtIndexK( head, 10, 20);
	        printElements( ans);//print the elements of the manipulated LinkedList
	        Node ans1=addAtIndexK( head, 11, 22);
	        printElements( ans1);
	}
	//function to add the element at a particular position
	public static Node addAtIndexK(Node head, int k, int value)
	{
		int count=0;
		Node temp=head;
		Node temp1=new Node(value);
		if(k==1)
		{
			temp1.next=head;
			return temp1;
		}
		//if we need to add at the end of the linked list
		if(k==countLength( head)+1)
		{
			Node temp2=head;
			while(temp2.next!=null)
			{
				temp2=temp2.next;
				if(temp2.next==null)
				{
					temp2.next=temp1;
					temp1.next=null;
				}
			}
			return head;
		}
		while(temp.next!=null)
		{
			count++;
			if(count==k-1)
			{
				temp1.next=temp.next;
				temp.next=temp1;
				break;
			}
			temp=temp.next;
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
