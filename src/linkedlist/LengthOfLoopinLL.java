package linkedlist;
import java.util.*;
public class LengthOfLoopinLL {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Node head=convertArr2LL(arr);
		int length=lengthOfLoop(head);
		System.out.println(length);

	}
public static Node convertArr2LL(int[] arr)
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
public static void printLL(Node head)
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data);
		
		System.out.print("->");
		temp=temp.next;
	}
	System.out.print("null");
}
public static int lengthOfLoop(Node head)
{
	
	Node temp=head;
	Map<Node, Integer> map=new HashMap<>();
	int counter=0;
	while(temp!=null)
	{
		if(map.containsKey(temp))
		{
			int lengthofloop=counter-map.get(temp);
			return lengthofloop;
		}
		map.put(temp, counter);
		temp=temp.next;
		counter++;
	}
	return 0;
}
}
