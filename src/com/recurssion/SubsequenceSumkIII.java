package com.recurssion;
import java.util.*;
public class SubsequenceSumkIII {

	public static void main(String[] args) {
		int[] arr= {3,2,1,1,5,5};
		int n=arr.length;
		int index=0;
		int target=5;
		int sum=0;
		int ans=subseq(arr, n, index, target, sum);
		System.out.println(ans);

	}
    public static int subseq(int[] arr, int n, int index, int target, int sum)
    {
    	if(index==n)
    	{
    		if(sum==target)
    		{
    			return 1;
    		}
    		return 0;
    	}
    	sum+=arr[index];
    	int left=subseq(arr, n, index+1, target, sum);
    	sum-=arr[index];
    	int right=subseq(arr, n, index+1, target, sum);
    	return (left+right);
    	
    }
}
