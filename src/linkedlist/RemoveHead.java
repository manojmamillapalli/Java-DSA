package linkedlist;

public class RemoveHead {

	public static void main(String[] args) {
		int[] arr= {};
		Node head=convertArray2LL( arr);
		Node ans=removeHead(head);
        System.out.println(ans);
	}
	//function to convert array to linked list
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
   // function to remove the head of the linked list
   public static Node removeHead(Node head)
   {
	   if(head==null)
		   return head;
	   head.next=head;
	return head;
	   
   }
}
