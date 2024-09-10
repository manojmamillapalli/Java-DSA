package sortingtechniques;

import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {12,43,76,90,45,43,32};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		msort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//selection sort
	//find the minimum value in the array
	//swap thr minimum element with the arr[i]
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)//outer loop iterates untill the n-2 th element of an array
		{
			int mini=i;//assign the mini element index is i
			for(int j=i;j<arr.length;j++)//inner loop iterates untill the last element of an array
			{
				if(arr[j]<arr[mini])//check if element exist more smaller than arr[mini]
				{
					mini=j;
				}
			}
			int temp=arr[mini];//if exists then swap it
			arr[mini]=arr[i];
			arr[i]=temp;
		}
	}
	//function to sort the array using the bubble sort
	public static void bubblesort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)//outer loop runs untill the end of the array
		{
			int swap=0;//to track an already sorted array declare an variable=0
			for(int j=0;j<arr.length-(i+1);j++)//inner loop runs untill the before element of the swapper one
				//so the range is from 0 to arr.length-(i+1)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=1;//if swapping is done just assign it to 1
					//that means the array has atleast one unsorted pair
				}
			}
			if(swap==0)//if the swap is still 0 after the completetion of the inner loop
				//that means the array is already sorted
			{
				break;
			}
			System.out.println("runs");//to track how many times the loop runs
		}
	}
	public static void insertionsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}
	public static void mergesort(int[] arr, int low,int mid,int high)
	{
		int left=low;
		int right=mid+1;
		ArrayList<Integer> list=new ArrayList<>();
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				list.add(arr[left]);
				left++;
			}
			else
			{
				list.add(arr[right]);
				right++;
			}
		}
		while(left<=mid)
		{
			list.add(arr[left]);
			left++;
		}
		while(right<=high)
		{
			list.add(arr[right]);
			right++;
		}
		for(int i=low;i<high;i++)
		{
			arr[i]=list.get(i-low);
		}
		
	}
	public static void msort(int[] arr, int low, int high)
	{
		if(low>=high)
		{
			return;
		}
		int mid=(low+high)/2;
		msort(arr, low,mid);
		msort(arr,mid+1,high);
		mergesort(arr,low,mid,high);
		
	}
}
