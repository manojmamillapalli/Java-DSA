package com.arrays;

public class MooresVoting {
public static void main(String[] args)
{
	int[] arr= {1,2,3,44,4,4,4,4,4,4,14};
	int ans=MajorityElement(arr);
	System.out.println(ans);
}
public static int MajorityElement(int[] arr)
{
	int ele=-1;
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(count==0)
		{
			ele=arr[i];
			count=1;
		}
		else if(arr[i]==ele)
		{
			count++;
		}
		else
		{
			count--;
		}
	}
	int count1=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ele)
		{
			count1++;
		}
		if(count1>arr.length/2)
		{
			return ele;
		}
	}
	return -1;
}
}
