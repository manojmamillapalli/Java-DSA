package com.recurssion;
import java.util.*;
public class TargetSum {

	public static void main(String[] args) {
		int[] arr= {2,3,4,7};
		int target=7;
		combinationSum(arr, target);
		

	}
public static void findComnbimations(int ind, int[] arr, int target,List<List<Integer>> ans, List<Integer> ds)
{
	if(ind==arr.length) {
		if(target==0)
		{
			ans.add(new ArrayList<>(ds));
		}
		return;
	}
	if(arr[ind]<=target)
	{
		ds.add(arr[ind]);
		findComnbimations(ind, arr, target-arr[ind], ans, ds);//here we can take the element 
		//multiple times. so we will get 2,2,3 as one of the result.
		//if we want to take the element only once then during the function call
		//we need to call like this findComnbimations(ind+1, arr, target-arr[ind], ans, ds);
		ds.remove(ds.size()-1);
	}
	findComnbimations(ind+1, arr, target, ans, ds);
}
public static void combinationSum(int[] candidates, int target)
{
	List<List<Integer>> list=new ArrayList<>();
	findComnbimations(0, candidates, target, list, new ArrayList<>());
	for(List l1:list)
	{
		System.out.println(l1);
	}
}
}
