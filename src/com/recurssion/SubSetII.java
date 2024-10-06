package com.recurssion;
import java.util.*;
public class SubSetII {

	public static void main(String[] args) {
		int[] arr= {1,2,2};
		Arrays.sort(arr);
		List<List<Integer>> ans=new ArrayList<>();
		int index=0;
		List<Integer> ds=new ArrayList<>();
		subSet2(arr, index, ds, ans);
        System.out.println(ans);
	}
public static void subSet2(int[] arr, int index, List<Integer> ds, List<List<Integer>> ans)
{
	ans.add(new ArrayList<>(ds));
	for(int i=index;i<arr.length;i++)
	{
		if(i!=index && arr[i]==arr[i-1]) continue;
		ds.add(arr[i]);
		subSet2(arr, i+1, ds, ans);
		ds.remove(ds.size()-1);
	}
	
}
}
