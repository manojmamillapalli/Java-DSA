package com.arrays;

public class KadensAlgorithm {

	public static void main(String[] args) {
		int[] arr= {1,2,-9,3,-10,4,5,6,-16,7,8};
		int ans=Kadens(arr);
		System.out.println(ans);
  
	}
	public static int Kadens(int[] arr)
	{
		int arrStart=-1;
		int arrEnd=-1;
		int start=-1;
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(sum==0)     start = i;//is sum==0 the subarray start from there
			sum+=arr[i];
			if(sum>maxSum)
			{
				maxSum=sum;
				arrEnd=i;// is sum>maxsum then subarray ends there
				arrStart=start;
			}
			if(sum<0) //is fum<0 again start from sum=0. so we can avoid the negative sums
				sum=0;
		}
		return arrEnd-arrStart+1;
	}

}
