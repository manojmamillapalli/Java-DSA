package doubleLL;

public class RemoveHeadElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2DLL(arr);
		printElements(head);
		Node head1=removeHead(head);
		printElements(head1);
	}
	public static Node removeHead(Node head)
	{
		Node prev=head;
		if(head==null|| head.next1==null)
		{
			return null;
		}
		head=head.next1;
		head.back1=null;
		prev.next1=null;
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

}
