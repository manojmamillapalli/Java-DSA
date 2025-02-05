package com.slidingwindow;
import java.util.*;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> list=new ArrayList<>();
		int k=3;
		list=findall(arr, k);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i) +" ");
		}

	}
	public static void  maxelements(int[] arr, int left, int right, int k, ArrayList<Integer> list)
	{
		int max=Integer.MIN_VALUE;
		for(int i=left;i<=right;i++)
		{
			max=Math.max(max, arr[i]);
		}
		list.add(max);
	}
	public static ArrayList<Integer> findall(int[] arr, int k)
	{
		ArrayList<Integer> maxx=new ArrayList<>();
		int right=0;
		int left=0;
		while(right<k-1)
		{
			right++;
		}
		while(right<arr.length) {
			maxelements(arr, left, right, k, maxx);
			left++;
			right++;
		}
		return maxx;
	}

}
