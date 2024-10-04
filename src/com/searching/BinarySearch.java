package com.searching;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int target=0;
		int result=binarySearch( arr,0, arr.length-1,  target);
		System.out.println(result);

	}
	//recurrence method
public static int binarySearch(int[] arr, int low, int high, int target)
{
	if(low>high)
	{
		return -1;
	}
	int mid=(low+high)/2;
	if(arr[mid]==target)
	{
		return mid;
	}
	else if(target>arr[mid])
	{
		return binarySearch(arr, mid+1, arr.length-1, target);
	}
	return binarySearch(arr, 0, mid-1, target);
	
}
public static int normalBinary(int[] arr, int target)
{
	int low=0;
	int high=arr.length-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(target==arr[mid])
		{
			return mid;
		}
		else if(target>arr[mid])
		{
			low=mid+1;
		}
		else
			high=mid-1;
	}
	return -1;
}
}
