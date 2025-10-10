package com.arrays;

public class MaxSubArrayProduct {

	public static void main(String[] args) {
		int[] arr= {1,2,0,3,-4,4,-1,5,6,7,-1,8,9};
		int ans=bruteForce(arr);
		System.out.println(ans);

	}
	//Bruteforce Generate all the subarrays and calculate their product and find the max of the products.
	public static int bruteForce(int[] arr)
	{
		int maxProduct=Integer.MIN_VALUE;
		int maxlength=0;
		for(int i=0;i<arr.length;i++)
		{
			int product=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				product*=arr[j];
				if(product>maxProduct)
				{
					maxProduct=product;
					maxlength=Math.max(maxlength, j-i+1);
				}
			}
		}
		return maxlength;
	}
	public static int optimal(int[] arr) {
	    int maxProduct = Integer.MIN_VALUE;
	    int prefix = 1, sufix = 1;

	    // To track the max length
	    int maxLength = 0;

	    // To track running lengths
	    int prefixLength = 0;
	    int suffixLength = 0;

	    for (int i = 0; i < arr.length; i++) {
	        // Forward pass
	        if (prefix == 0) {
	            prefix = 1;
	            prefixLength = 0;
	        }
	        prefix *= arr[i];
	        prefixLength++;

	        // Backward pass
	        if (sufix == 0) {
	            sufix = 1;
	            suffixLength = 0;
	        }
	        sufix *= arr[arr.length - 1 - i];
	        suffixLength++;

	        // Update max product and corresponding length
	        if (prefix > maxProduct) {
	            maxProduct = prefix;
	            maxLength = prefixLength;
	        }
	        if (sufix > maxProduct) {
	            maxProduct = sufix;
	            maxLength = suffixLength;
	        }
	    }

	   // System.out.println("Maximum product = " + maxProduct);
	    return maxLength;
	}


}
