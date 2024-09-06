package linkedlist;

public class RemoveTail {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArray2LL(arr);// return s head of the array which converted to LinkedList
		Node ans=removeTail(head);//calls the tail remover method
		System.out.println(ans.data);// prints the last element after removal of the tail
	}
	//method convert array to LnkedList
	public static Node convertArray2LL(int[] arr)
	{
		if(arr.length==0)
		{
			return null;
		}
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=0;i<arr.length;i++)
		{
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
	//methiod used to remove the last element
	public static Node removeTail(Node head)
	{
		Node temp=head;
		if(head==null || head.next==null)
		{
			return head;
		}
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		 temp.next=null;
		 return temp;
	}

}
