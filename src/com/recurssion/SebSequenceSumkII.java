package com.recurssion;
import java.util.*;
public class SebSequenceSumkII {

	public static void main(String[] args) {
		int[] arr= {2,5};
		List<Integer> ds=new ArrayList<>();
		int target=5;
		int sum=0;
		int n=arr.length;
		subseq(arr, sum, target, 0, n, ds);
	
		
	}
public static boolean subseq(int[] arr, int sum, int target, int index, int n, List<Integer> ds)
{
	if(index==n)
	{
		if(sum==target)
		{
			for(int i=0;i<ds.size();i++)
			{
				System.out.print(ds.get(i)+" ");
			}
			System.out.println();
			return true;
		}
		else
		return false;
	}
	
	ds.add(arr[index]);
	sum+=arr[index];
	if(subseq(arr, sum, target, index+1, n, ds)==true)
		return true;
	sum-=ds.get(ds.size()-1);
	ds.remove(ds.size()-1);
	if(subseq(arr, sum, target, index+1, n, ds)==true)
		return true;
	return false;
}
}
