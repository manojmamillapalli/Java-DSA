package com.trees;
import java.util.*;
public class MaxPathSum {
//maxpath sum checks in which path the sum will be greatest
	// so that we need to traverse the multiple paths and take the max sum of the path.
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		TreeNode root=convertArr2Tree(arr);
		int[] maxsum=new int[1];
		int result=maxpathsum(root, maxsum);
		System.out.println(result);

	}
	public static TreeNode convertArr2Tree(int[] arr)
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
	public static int  maxpathsum(TreeNode root, int[] maxsum)
	{
		
		if(root==null)
		{
			return 0;
		}
		int left=Math.max(0, maxpathsum(root.left, maxsum));
		int right=Math.max(0, maxpathsum(root.right, maxsum));
		maxsum[0]=Math.max(maxsum[0],  left+right+root.data);
		return Math.max(left,  right)+root.data;
		
	}

}
