package doubleLL;

public class ReverseDoubleLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2DLL(arr);
		printElements(head);
        Node root=reverseDoubleLL( head);
        printElements(root);
	}
	public static Node convertArray2DLL(int[] arr)
	{
		Node head=new Node(arr[0]);
		Node prev=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(null, arr[i], prev);//new node to store 2nd array element
			prev.next1=temp;//prev which is dummy for head points to temp
			prev=temp;//pointing back the temp to prev
		}
		return head;
	}
	public static Node reverseDoubleLL(Node head)
	{
		Node prev=null;//create a null node to store the root back
		Node current=head;//create a dummy node which points to head
		while(current!=null)
		{
			prev=current.back1;//store the dummt back to prev variable
			current.back1=current.next1;//make dummy.back as dummy.next
			current.next1=prev;//make dummy.next as prev
			current=current.back1;
		}
		return prev.back1;
	}
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
