package doubleLL;

public class RemoveElementAtIndexK {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,12,7,8,19,39,49,9};
		Node head=convertArray2DLL(arr);//prints the head of the Double LL which is obtained from Array
		printElements(head);//prints the Double Linked list
		Node head1=removeAtIndexK(head,7);//Remove the Node at Index k
		printElements(head1);//prints the elements after removal of the node
	}
	//remove the node at an index k
	public static Node removeAtIndexK(Node head, int k)
	{
		int count=0;
		Node temp=head;
		if(k==1)//if k=1 then remove head
		{
			if(head==null|| head.next1==null)
			{
				return null;
			}
			head=head.next1;
			head.back1=null;
			temp.next1=null;
			return head;
		}
		if(k==lengthOfDLL(head))//if k=n remove node at the end
		{
			while(temp.next1!=null)
			{
				if(temp.next1.next1==null)
				{
					temp.next1.back1=null;
					temp.next1=null;
					break;
				}
				temp=temp.next1;
			}
			return head;
		}
		
		while(temp!=null)//else find the count of the node and then remove the element 
		{
			count++;
			if(count==k)
			{
				temp.next1.back1=temp.back1.next1;//links the temp.next element to the temp.back element 
				temp.back1.next1=temp.next1;//links the temp.back element to the temp.next
				temp.next1=null;//make temp.next=null
				temp.back1=null;//make temp.back==null
				//therefore temp element will be seperated and goes to garbage collector
				break;
			}
			temp=temp.next1;
		}
		return head;
	}
	//convert Array to Double Linked List
			public static Node convertArray2DLL(int[] arr)
			{
				Node head=new Node(arr[0]);
				Node prev=head;
				for(int i=1;i<arr.length;i++)
				{
					Node temp=new Node(null,arr[i],prev );
					prev.next1=temp;
					prev=prev.next1;
				}
				return head;
				
			}
			//print the elements of The doubly linked list
			public static void printElements(Node head)
			{
				Node temp=head;
				while(temp!=null)
				{
					System.out.print(temp.data1+"->");
					System.out.print("<-");
					temp=temp.next1;
				}
				System.out.print("null");
				System.out.println();
			}
			public static int lengthOfDLL(Node head)
			{
				int count=0;
				Node temp=head;
				while(temp!=null)
				{
					count++;
					temp=temp.next1;
				}
				return count;
			}

}
