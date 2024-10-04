package sortingtechniques;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		
int[] arr= {4,6,8,1,9,3,0};
qs(arr, 0, arr.length-1);
for(int i:arr)
{
	System.out.print(i);
}
	}
	public static int partition(int[] arr, int low, int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while((pivot>=arr[i]) && i<high)
			{
				i++;
			}
			while((pivot<=arr[j]) && j>low)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
public static void qs(int[] arr, int low, int high)
{
	if(low<high)
	{
	int par=partition(arr, low, high);
	qs(arr, low, par-1);
	qs(arr, par+1, high);
	}
}
}
