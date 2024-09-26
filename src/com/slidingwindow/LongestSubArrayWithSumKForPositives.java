package com.slidingwindow;
import java.util.*;
public class LongestSubArrayWithSumKForPositives {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,1,0,0,0,2,3,4,5};
		int k=6;
		int n=arr.length;
		int sum=0;
		int max=0;
		int left=0;
		int right=0;
		while(right<n)
		{
			while(left<=right && sum>k)
			{
				sum-=arr[left];
				left++;
			}
			
			if( right<n)
			{
			sum+=arr[right];
			}
			right++;
			if(sum==k)
			{
				max=Math.max(max, right-left);
			}
		}
   System.out.println(max);
	}

}
