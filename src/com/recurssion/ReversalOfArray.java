package com.recurssion;
import java.util.*;
public class ReversalOfArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int n: arr)
		{
			System.out.print(n);
		}
		System.out.println();
		arrayReversal(arr, 0);
		for(int n: arr)
		{
			System.out.print(n);
		}
	}
	public static void arrayReversal(int[] arr, int index)
	{
		if(index>=arr.length/2)
		{
			return;
		}
		swap(arr,index, arr.length-index-1);
		arrayReversal(arr, index+1);
	}
public static void swap(int[] arr, int a, int b)// we must pass the array into the swap method so that it directly
// swaps the elements of the array insted of swapping the primitiva variables and those didnt effect the original array
{
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}
}
