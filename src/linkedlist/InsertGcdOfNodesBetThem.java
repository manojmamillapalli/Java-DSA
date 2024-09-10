package linkedlist;

public class InsertGcdOfNodesBetThem {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		 Node  head=convertArray2LL(arr);//assign the first element of array to head
	        printElements( head);// prints the element of original linkedlist
	      Node root=  insertGreatestCommonDivisors(head);
	      printElements( head);
	}
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
		 public static int gcd(int a, int b)
		    {
		        while(a>0 && b>0)
		        {
		            if(a<b)
		            {
		                b=b%a;
		            }
		            else
		            {
		                a=a%b;
		            }
		        }
		      return a==0?b:a;
		    }
		 public static Node insertGreatestCommonDivisors(Node head) {
		        if(head==null || head.next==null)
		        {
		            return head;
		        }
		        Node root=head;
		        while(root!=null && root.next!=null)
		        {
		        int value=gcd(root.data, root.next.data);
		        Node ele=new Node(value);
		        ele.next=root.next;
		        root.next=ele;
		        root=root.next.next;
		        }
		        return head;
		        
		    }
}
