package com.greedy;
import java.util.*;
// the lemons in market cost of 5 dollars and customers come with different notes like 5, 10 and 20
//now we need to check if all the lemonades is possible to sell or not
public class Lemonadehange {

	public static void main(String[] args) {
		int[] arr={5,5,10,5,10,5,20,20};
		System.out.println(lemonadechange(arr));

	}
public static boolean lemonadechange(int[] arr)
{
	int five=0;
	int ten=0;
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==5)
		{
			five++;
		}
		else if(arr[i]==10)
		{
			if(five!=0)
			{
				five--;
				ten++;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(arr[i]==20)
			{
				if(five>0 && ten>0)
				{
					five--;
					ten--;
				}
				else if(five>=3)
				{
					five=five-3;
				}
				else
				{
					return false;
				}
			}
		}
	}
	return true;
}
}
