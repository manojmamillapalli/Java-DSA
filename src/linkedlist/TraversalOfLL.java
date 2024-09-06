package linkedlist;

public class TraversalOfLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		traversalOfLL( arr);
	}
	public static void traversalOfLL(int[] arr)
	{
		Node head=new Node(arr[0]);
		System.out.print(head.data+"->");
		Node mover=head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
			System.out.print(mover.data+"->");
		}
		System.out.print("null");
	}

}
