package com.greedy;
import java.util.*;
public class SjfAlgorithm {

	public static void main(String[] args) {
		int[] arr= {4,3,7,1,2};
		int waitingtime=0;// 1 2 3 4 5
		
		int time=0;
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			waitingtime+=time;
			time+=arr[i];
		}
		System.out.println((int)waitingtime/n);
	}

}
