package linkedlist;
import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data1, Node next1)
	{
		this.data=data1;
		this.next=next1;
	}
	//memory space will depend on a system if we use the pointers method
	//in cpp language
	Node(int data1)
	{
		this.data=data1;
		this.next=null;
	}
}
public class LinkedListIntro {

	public static void main(String[] args) {
		
int[] arr= {2,5,8,9};
Node y=new Node(arr[3]);
System.out.println(y.data);
	}

}
