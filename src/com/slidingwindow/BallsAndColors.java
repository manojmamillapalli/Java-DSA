package com.slidingwindow;
import java.util.*;
public class BallsAndColors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
int[] result=new int[n];
result=colorResult(arr,4);
for(int i=0;i<result.length;i++)
{
	System.out.println(result[i]);
}
	}
	public static int[] colorResult(int[][] arr, int limit)
	{
		HashMap<Integer, Integer> BallToColors=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> colorFrequency=new HashMap<Integer, Integer>();
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int ball=arr[i][0];
			int color=arr[i][1];
			if(BallToColors.containsKey(ball))
			{
				int oldcolor=BallToColors.get(ball);
				colorFrequency.put(oldcolor, colorFrequency.get(oldcolor)-1);
				if(colorFrequency.get(oldcolor)==0)
				{
					colorFrequency.remove(oldcolor);
				}
			}
			BallToColors.put(ball, color);
			colorFrequency.put(color, colorFrequency.getOrDefault(color,0)+1);
			result[i]=colorFrequency.size();
		}
		return result;
		
	}

}
