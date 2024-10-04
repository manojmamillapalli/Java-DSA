package com.recurssion;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		
int n=fib(5);
int n1=fib1(5);
int n2=fib2(5);
int n3=fib3(5);
System.out.println(n+" "+n1+" "+n2+" "+n3);
	}
public static int fib(int n)//fibonacci using the recurssion
{
	if(n<2)
	{
		return n;
	}
	return fib(n-1)+fib(n-2);
}
public static int fib1(int n)//using dynamic programming
{
	int[] dp=new int[n+1];
	Arrays.fill(dp, -1);
	if(n<2)
	{
		dp[n]=n;
	}
	if(dp[n]!=-1)
	{
		return dp[n];
	}
	return dp[n]=fib1(n-1)+fib1(n-2);
}
public static int fib3(int n)//using tabulation
{
	int[] dp=new int[n+1];
	dp[0]=0;
	dp[1]=1;
	for(int i=2;i<=n;i++)
	{
		dp[i]=dp[i-1]+dp[i-2];
	}
	return dp[n];
}
public static int fib2(int n)//using memoization
{
	int prev=1;
	int prev2=0;
	for(int i=2;i<=n;i++)
	{
		int curr=prev+prev2;
		prev2=prev;
		prev=curr;
	}
	return prev;
}

}
