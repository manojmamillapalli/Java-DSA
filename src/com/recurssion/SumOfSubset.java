package com.recurssion;
import java.util.*;
public class SumOfSubset {

	public static void main(String[] args) {
		int[] arr= {3,2,1};
		List<Integer> ds=new ArrayList<>();
		sumSubset(arr, arr.length, 0, ds, 0);
		for(int i=0;i<ds.size();i++)
		{
			System.out.print(ds.get(i)+" ");
		}
		System.out.println();
	}
public static void sumSubset(int[] arr, int n, int index, List<Integer> ds, int sum)
{
	if(index==n)
	{
		ds.add(sum);
		return;
	}
	sum+=arr[index];
	sumSubset(arr, n, index+1, ds, sum);
	sum-=arr[index];
	sumSubset(arr, n, index+1, ds, sum);
}
}
