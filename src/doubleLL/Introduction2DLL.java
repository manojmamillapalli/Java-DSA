package doubleLL;

//node class defining the structure of the Double Linked List
class Node
{
	Node next1;
	int data1;
	Node back1;
	Node(Node next, int data, Node back)
	{
		this.next1=next;
		this.data1=data;
		this.back1=back;
	}
	Node(int data)
	{
		data1=data;
		back1=null;
		next1=null;
	}
}
public class Introduction2DLL {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2DLL(arr);
		printElements(head);
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
		while(temp.next1!=null)
		{
			System.out.print(temp.data1+"->");
			System.out.print("<-");
			temp=temp.next1;
		}
		System.out.print("null");
		System.out.println();
	}
}
