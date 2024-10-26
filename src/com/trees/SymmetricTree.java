package com.trees;
import java.util.*;
public class SymmetricTree {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		TreeNode root=convertArr2Tree(arr);
		System.out.println(root==null || symmetricTreeOrNot(root.left, root.right));
	}
	public static TreeNode convertArr2Tree(int[] arr)
	{
		TreeNode root=new TreeNode(arr[0]);
		Queue<TreeNode> queue=new LinkedList<>();
		int i=1;
		queue.add(root);
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
				i++;;
			}
		}
		return root;
	}
	
	public static boolean symmetricTreeOrNot(TreeNode left, TreeNode right)
	{
		if(left==null || right==null)
		{
			return left==right;
		}
		if(left.data!=right.data)
		{
			return false;
		}
		return symmetricTreeOrNot(left.left, right.right) && symmetricTreeOrNot(left.right, right.left);
	}

}
