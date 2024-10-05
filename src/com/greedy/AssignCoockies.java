package com.greedy;
import java.util.*;
public class AssignCoockies {
//two arrays one is greedy another is size of coockies
	//the one with more greedy need to get cookie of size>=greedy and no one cookie is assigned twice.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] greedy= {1,2,3,4,5,6};
int[] size= {1,1,2,3,3,4};
Arrays.sort(greedy);
Arrays.sort(size);
int n=greedy.length-1;
int m=size.length-1;
int left=0;
int right=0;
while(left<=n && right <=m)
{
	if(greedy[left]<=size[right])
	{
		left++;
	}
	else
	{
	right++;
	}
	
}
System.out.println(left);/////////////////

	}//siign cookies to java

}
