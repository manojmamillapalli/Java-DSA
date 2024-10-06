package com.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {

	public static void main(String[] args) {
		// we can store in matrix(adjacency matrix)
		//we can also store them in a list
		// As the given graph is an undirected graph we need to store it in both adjacent places
		//that is we need to store them in arr[i][j] and arr[j][i]
		int n=6;
		int m=3;
		//1--------2
		int[][] arr=new int[n+1][m+1];
		arr[1][2]=1;
		arr[2][1]=1;
		//2------3
		arr[2][3]=1;
		arr[3][2]=1;// in this way we need to represent the graph in an array
		// storing in a matrix is goig to be costly
		// now we store in a adjancey arraylist
		List<List<Integer>> list=new ArrayList<>();
		// in the same way we will be provided with the nodes and the edges
		//first we need to store the n+1 empty nodes in an arraylist of type List<Integer>
		for(int i=0;i<=n;i++)
		{
			list.add(new ArrayList<>());
		}
		//1------2
		list.get(1).add(2);//first we need to get the inner list and add thet element to thet list
		//thats why we inserted the empty arraylist into the list of type List<Integer> else we will get an null pointer exception
		list.get(2).add(1);// as it is an undirected graph we need to add the elements from both the edges
        // 3------1
		list.get(3).add(1);
		list.get(1).add(3);
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<list.get(i).size();j++)
			{
				System.out.println(list.get(i).get(j)+" ");
			}
		}
		
	}

}
