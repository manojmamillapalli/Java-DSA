package com.slidingwindow;
import java.util.*;
public class CountOfSubstringContainAllChars {

	public static void main(String[] args) {
		String str="abcbac";
		int count=countOfSubstr(str);
		System.out.println(count);
	}
	//function to find the count of the substrings which contain all the characters 
	//a,b,c 
public static int countOfSubstr(String str)
{
	int count=0;
	
	for(int i=0;i<str.length();i++)//outer loop which iterates over the string
	{
		int[] hash=new int[3];//hash array which is initialized to zero after completetion of inner loop iteration
		for(int j=i;j<str.length();j++)//inner loop which calculates the no of substrings
		{
		hash[str.charAt(j)-'a']=1;// charAt(i)-'a' gives 0 for character a and 1 for character b and so on upto hash[3] the elements stored are 1
		if(hash[0]+hash[1]+hash[2]==3)
		{
			//count++
			count=count+(str.length()-j);//once we encounter the substring with the required condition then all
			//the right characters are also comes under the substrings.
			//so the index j where we encounter the substring count=1
			//from j+1 to n we will add at one time without iterating again and add break statement;
			break;
		}
		}
	}
	return count;
	
}
}
