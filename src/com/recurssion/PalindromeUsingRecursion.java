package com.recurssion;
import java.util.*;
public class PalindromeUsingRecursion {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2};
		System.out.println(palindrome2(arr, 0, arr.length-1));
	}
public static boolean palindrome(int[] arr, int index)
{
	if(arr[index]!=arr[arr.length-1-index])
		return false;
	if(index>=arr.length/2)
		return true;
	return palindrome(arr, index+1);
}
public static boolean palindrome2(int[] arr, int left, int right)
{
	if(arr[left]!=arr[right])
	{
		return false;
	}
	if(left>=right)
		return true;
	return palindrome2(arr, left+1, right-1);
}
}
