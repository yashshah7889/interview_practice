package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {
int v; //vertex
int e;//edges
int[][] adjmatrix;

public GraphMatrix(int nodes) {
	this.v=nodes;
	this.e=0;
	this.adjmatrix=new int[nodes][nodes];
}

public void addEdge(int u,int u1){
	this.adjmatrix[u][u1]=1;
	this.adjmatrix[u1][u]=1;
	this.e++;
}

public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(v+" vertices"+e+" edges "+"\n");
	for(int i=0;i<v;i++) {
		sb.append(i+": ");
		for(int j:adjmatrix[i]) {
			sb.append(j+" ");
		}
		sb.append("\n");
	}
	
	return sb.toString();	
}

public void bfs(int s) {
	boolean[] visited=new boolean[this.v];
	Queue<Integer> q=new LinkedList<>();
	visited[s]=true;
	q.offer(s);
	while(!q.isEmpty()) {
		int u=q.poll();
		System.out.print(u+" ");
		for(int i:this.adjmatrix[u]) {
			if(!visited[i]) {
				visited[i]=true;
				q.offer(i);
			}
		}
	}
}

public static void main(String[] args) {
	GraphMatrix x=new GraphMatrix(4);
	x.addEdge(0,1);
	x.addEdge(1,2);
	x.addEdge(2,3);
	x.addEdge(3,0);
	System.out.println(x);
}
}
