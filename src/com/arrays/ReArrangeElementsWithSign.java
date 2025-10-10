package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeElementsWithSign {

	public static void main(String[] args) {
int[] arr= {1,-2,3,-9,8,0,-8,-4};  
int[] ans=new int[arr.length];
ans=reArrangeArrayElements(arr);
for(int i=0;i<ans.length;i++)
{
	System.out.print(ans[i]);
}
	}
	public static int[] reArrangeArrayElements(int[] arr)
	{
		int[] ans=new int[arr.length];
		List<Integer> posList=new ArrayList<>();
		List<Integer> negativeList=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negativeList.add(arr[i]);
			}
			else
			{
				posList.add(arr[i]);
			}
		}
		if(posList.size()<negativeList.size()) {
			for(int i=0;i<posList.size();i++)
			{
				ans[2*i]=posList.get(i);
				ans[2*i +1]=negativeList.get(i);
			}
			int index=posList.size()*2;
			for(int i=posList.size();i<negativeList.size();i++)
			{
				ans[index]=negativeList.get(i);
				index++;
			}
		}
		else
		{
			for(int i=0;i<negativeList.size();i++)
			{
				ans[2*i]=posList.get(i);
				ans[2*i +1]=negativeList.get(i);
			}
			int index=negativeList.size()*2;
			for(int i=negativeList.size();i<posList.size();i++)
			{
				ans[index]=posList.get(i);
				index++;
			}
		}
	    return ans;
	}

}
