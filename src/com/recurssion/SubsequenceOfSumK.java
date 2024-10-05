package com.recurssion;
import java.util.*;
public class SubsequenceOfSumK {

	public static void main(String[] args) {
		int[] arr= {3,1,1,2};
		int target=5;
		List<Integer> ds=new ArrayList<>();
		subseqsum(arr, ds, 0, target,0,arr.length);

	}
public static void subseqsum(int[] arr, List<Integer> ds, int sum, int target, int index, int n)
{
	if(index==n)
	{
		if(sum==target)
		{
			for(int i=0;i<ds.size();i++) {
				System.out.print(ds.get(i)+" ");
			}
			System.out.println();
		
		}
		return;
	}
	ds.add(arr[index]);
	sum+=arr[index];
	subseqsum(arr, ds,sum, target, index+1,n);
	sum=sum-ds.get(ds.size()-1);
	ds.remove(ds.size()-1);
	subseqsum(arr, ds, sum, target, index+1, n);
	
}
}
