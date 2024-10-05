package com.recurssion;
import java.util.*;
public class Subsequence {
// subsequences are two types
	//1. contigious subsequence and non contigious subsequence
	// if they mentioned just subsequence then we will proceed with the non contigious subsequence
	//A sequence is a subsequence if and only if the order of the elements cannot be changed even though
	//we skip few of the elements(NON CONTIGIOUS)
	//example from the given example
	//3
	//3,1
	//3,1,2
	//1
	//1,2
	//2
	///3,2 these are the sunsequences only (3,2) is NON-CONTIGIOUS subsequence.
	public static void main(String[] args) {
		int[] arr= {3,1,2};
		List<Integer> ds=new ArrayList<>();
		int n=arr.length;
		subseq(arr,ds,n,0);
	}
	public static void subseq(int[] arr, List<Integer> ds, int n, int index)
	{
		if(index==n)
		{
			for(int i=0;i<ds.size();i++)
			{
				System.out.print(ds.get(i)+" ");
			}
			System.out.println();
			return ;
		}
		ds.add(arr[index]);//first add the element to list.
		subseq(arr, ds, n, index+1);// take
		ds.remove(ds.size()-1);// remove the taken value before implementing the not taken function
		subseq(arr, ds, n, index+1);// not take
	}

}
