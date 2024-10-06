package com.graphs;
import java.util.*;
public class DFS {

	public static void main(String[] args) {
		

	}
	public static void dfs(int v,boolean visited[],  ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ls)
	{
		visited[v]=true;
		ls.add(v);
		for(Integer it: list.get(v))
		{
			if(visited[it]==false)
			{
				dfs(it, visited, list, ls);
			}
		}	
	}
public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> list)
{
	boolean visited[]=new boolean[v+1];
	visited[0]=true;
	ArrayList<Integer> ls=new ArrayList<>();
	dfs(0, visited, list, ls);
	return ls;
}
}
