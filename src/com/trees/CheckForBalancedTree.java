package com.trees;
import java.util.*;
public class CheckForBalancedTree {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
        TreeNode head=convertArray2Tree(arr);
        int n=check(head);
       if(check(head)!=-1)
       {
    	   System.out.println("true");
       }
	}
public static TreeNode convertArray2Tree(int[] arr)
{
	TreeNode head=new TreeNode(arr[0]);
	int i=1;
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(head);
	while(i<arr.length)
	{
		TreeNode currentnode=queue.poll();
		if(i<arr.length) {
			currentnode.left=new TreeNode(arr[i]);
			queue.add(currentnode.left);
			i++;
		}
       	  if(i<arr.length) {
				currentnode.right=new TreeNode(arr[i]);
				queue.add(currentnode.right);
				i++;
			}
		
	}
	return head;
}
public static int check(TreeNode head)
{
	TreeNode temp=head;
	if(temp==null)
	{
		return 0;
	}
	int left=check(temp.left);
	if(left==-1)
	{
		return -1;
	}
	int right=check(temp.right);
	if(right==-1)
	{
		return -1;
	}
	if(Math.abs(left-right)>1)
	{
		return -1;
	}
	return Math.max(left,  right)+1;
}
}
