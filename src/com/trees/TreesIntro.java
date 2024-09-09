package com.trees;
import java.util.*;
//user defined datastructure to store tree data type
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to create a TreeNode with a given value and its children
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // Constructor to create a TreeNode with a given value
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreesIntro {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		List<Integer> list=new ArrayList<>();
		List<Integer> level=new ArrayList<>();
		List<Integer> pre=new ArrayList<>();
		List<Integer> post=new ArrayList<>();
		List<Integer> itrpre=new ArrayList<>();
		ArrayList<Integer> iterin=new ArrayList<>();
        TreeNode root=arrayToTree(arr);
        printInOrder(root, list);
        printLevelOrder(root, level);
        printPostOrder(root,  pre);
        printPreOrder(root, post);
        iterativePreOrder(root,  itrpre);
        iterativein0rder( root,  iterin);
        for(int i:list)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:level)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:pre)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:post)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:itrpre)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:iterin)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        int length=depthOfTree(root);
        System.out.println(length);
	}
	//function to convert array to tree
public static TreeNode arrayToTree(int[] arr)
{
	TreeNode root=new TreeNode(arr[0]);
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	int i=1;
	while(i<arr.length) {
		TreeNode currentNode=queue.poll();
		if(i<arr.length) {
			currentNode.left=new TreeNode(arr[i]);
			queue.add(currentNode.left);
			i++;
		}
		if(i<arr.length) {
			currentNode.right=new TreeNode(arr[i]);
			queue.add(currentNode.right);
			i++;
		}
	}
	return root;
}
public static void printInOrder(TreeNode root, List<Integer> list)
{
	if(root==null)
	{
		return ;
	}
	printInOrder(root.left, list);
	list.add(root.data);
	printInOrder(root.right,list);
}

public static void printLevelOrder(TreeNode root, List<Integer> level)
{
	if(root==null)
	{
		return ;
	}
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		TreeNode currentNode=queue.poll();
		level.add(currentNode.data);
		if(currentNode.left!=null)
		{
			queue.add(currentNode.left);
		}
		if(currentNode.right!=null)
		{
			queue.add(currentNode.right);
		}
	}
}
public  static void printPostOrder(TreeNode root, List<Integer> pre)
{
	if(root==null)
	{
		return;
	}
	printPostOrder(root.left, pre);
	printPostOrder(root.right,pre);
	pre.add(root.data);
}
public static void printPreOrder(TreeNode root, List<Integer> post)
{
	if(root==null)
	{
		return;
	}
	post.add(root.data);
	printPreOrder(root.left, post);
	printPreOrder(root.right,post);
	
}
//iterative preorder traversal of the tree without using the recurssion
public static void iterativePreOrder(TreeNode root, List<Integer> itrpre)
{
	Stack<TreeNode> preorder=new Stack<>();//create one stack data structure
	if(root==null)//check if root  is null
	{
		return;
	}
	preorder.push(root);//if not push root value into stack
	//we all know that principle of stack is First in Last out
	while(!preorder.isEmpty())//initially stack must contain an root node.
		//so while condition is true
	{
		root=preorder.pop();//pop the value from stack and add it in list.
		//because preorder principle is Root Left Right
		itrpre.add(root.data);//adding the popped node value to the list
		if(root.right!=null)//still the root is assigned to the popped value.
			//check if root.right is null or not
			//we are checking root.right first because we are using stack data structure.
			//so that we will return that last which obeys the principle of Preorder Right Left and Right
		{
			preorder.push(root.right);//push into stack
		}
		if(root.left!=null)//similarly check forleft value
		{
			preorder.push(root.left);//push into stack
		}
		//after the completion of the pushing of the left value root.left value is at the top of the stack
		//so we pop it and add to list
		//again the iteration continues untill we found the root.left is null
	}
}
//function for iterative in order traversal
public static void iterativein0rder(TreeNode root, List<Integer> iterin)
{
	TreeNode head=root;
	Stack<TreeNode> st=new Stack<>();
	while(true)
	{
		if(head!=null)
		{
			st.push(head);
			head=head.left;
		}
		else
		{
			if(st.isEmpty())
			{
				break;
			}
			head=st.pop();
			iterin.add(head.data);
			head=head.right;
		}
	}
}
public static int depthOfTree(TreeNode root)
{
	if(root==null)
	{
		return 0;
	}
	int k1=depthOfTree(root.left);
	int k2=depthOfTree(root.left);
	return 1+Math.max(k1, k2);
	
}
}
