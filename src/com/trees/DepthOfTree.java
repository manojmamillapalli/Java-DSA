package com.trees;
import java.util.*;
public class DepthOfTree {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
        TreeNode root=convertArray2LL(arr);
        int height=depthOfTree(root);
        System.out.println(height);
	}
public static TreeNode convertArray2LL(int[] arr)
{
	TreeNode root=new TreeNode(arr[0]);
	Queue<TreeNode> queue=new LinkedList<>();
	queue.add(root);
	int i=1;
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
public static int depthOfTree(TreeNode root)
{
	if(root==null)
	{
		return 0;
	}
	int k1=depthOfTree(root.left);
	int k2=depthOfTree(root.right);
	return 1+Math.max(k1, k2);
	
}
}
