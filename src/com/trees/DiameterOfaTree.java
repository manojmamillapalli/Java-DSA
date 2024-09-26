package com.trees;
import java.util.*;
public class DiameterOfaTree {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		TreeNode root=convertArray2Tree(arr);
		int[] arr1=new int[1];
		arr1[0]=diameter(root, arr1);
		System.out.println(arr1[0]);

	}
public static TreeNode convertArray2Tree(int[] arr)
{
	TreeNode root=new TreeNode(arr[0]);
	int i=1;
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	while(i<arr.length) {
		TreeNode current=queue.poll();
		if(i<arr.length) {
		current.left=new TreeNode(arr[i]);
		queue.add(current.left);
		i++;
		}
		if(i<arr.length) {
			current.right=new TreeNode(arr[i]);
			queue.add(current.right);
			i++;
			}
	}
	return root;
}
public static int diameter(TreeNode head, int[] diameter)
{
	if(head==null)
	{
		return 0;
	}
	int left=diameter(head.left, diameter);
	int right=diameter(head.right, diameter);
	diameter[0]=Math.max(diameter[0], left+right);
	return Math.max(left, right)+1;
}
}
