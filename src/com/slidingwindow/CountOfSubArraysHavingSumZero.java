package com.slidingwindow;
import java.util.*;
public class CountOfSubArraysHavingSumZero {

	public static void main(String[] args) {
		int[] arr= {0,0,5,5,0,0,-1,1};
		int count=countOsSubArrays(arr);
		System.out.println(count);
	}
public static int countOsSubArrays(int[] arr)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=i;j<arr.length;j++)
		{
			sum=sum+arr[j];
			if(sum==0)
			{
				count++;
			}
		}
	}
	return count;
	
}
}
