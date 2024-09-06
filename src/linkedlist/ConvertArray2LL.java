package linkedlist;

public class ConvertArray2LL {

	public static void main(String[] args) {
		int[] arr= {110,34,5,7,8};
		Node head=convertArray2LL(arr);
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(head.data);
	}
public static Node convertArray2LL(int[] arr)
{
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
}
