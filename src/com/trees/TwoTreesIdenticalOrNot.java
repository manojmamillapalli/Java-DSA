package com.trees;
import java.util.*;
public class TwoTreesIdenticalOrNot {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		TreeNode root=convertArray2Tree(arr);
		TreeNode root1=convertArray2Tree(arr1);
		System.out.println(findIdentical( root,  root1));
		
	}
public static TreeNode convertArray2Tree(int[] arr)
{
	TreeNode root=new TreeNode(arr[0]);
	int i=1;
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	while(i<arr.length) {
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
	return root;
}
public static boolean findIdentical(TreeNode root, TreeNode root1)
{
	if(root==null|| root1==null)
	{
		return (root==root1);
	}
	return (root.data==root1.data)&&findIdentical(root.left, root1.left)&&findIdentical(root.right,root1.right);
}
}
