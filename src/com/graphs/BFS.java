package com.graphs;
import java.util.*;
public class BFS {

	public static void main(String[] args) {
		// as the name suggest breadth or we can say level wise traversal
		// breadth first traversal depends upon the starting element of the graph
	   

	}
public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
{
	ArrayList<Integer> bfs=new ArrayList<>();
	boolean[] visited=new boolean[v];
	Queue<Integer> queue=new LinkedList<>();
	queue.add(0);
	visited[0]=true;
	while(!queue.isEmpty()) {
		Integer node=queue.poll();
		bfs.add(node);
		for(Integer it: adj.get(node))
		{
			if(visited[it]==false)
			{
				visited[it]=true;
				queue.add(it);
			}
		}
	}
	return bfs;
}
}
