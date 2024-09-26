package com.slidingwindow;
import java.util.*;
public class LongestSubArrayWithSumKForPositivesAndNegatives {

	public static void main(String[] args) {
		int[] arr= {1,1,1,3,4,5,6};
		int k=3;
		int sum=0;
		int max=0;
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==k)
			{
				max=Math.max(max, i+1);
			}
			int rem=sum-k;
			if(map.containsKey(rem))
			{
				int len=i-map.get(rem);
				max=Math.max(max, len);
			}
			if(!map.containsKey(sum))
			{
				map.put(sum,i);
			}
		}
        System.out.print(max);
	}

}
