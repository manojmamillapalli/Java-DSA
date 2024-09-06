package doubleLL;

public class RemoveEndOfDLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2DLL(arr);
		printElements(head);
		Node head1=removeEndOfTheDLL(head);
		printElements(head1);

	}
	public static Node removeEndOfTheDLL(Node head)
	{
		Node temp=head;
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
