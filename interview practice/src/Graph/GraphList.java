package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphList {
	int V,E;
	LinkedList<Integer>[] adj;
public GraphList(int nodes) {
	this.adj=new LinkedList[nodes];
	this.V=nodes;
	this.E=0;
	for(int i=0;i<V;i++) {
		this.adj[i]=new LinkedList<>();
	}
	}

public void addEdge(int u,int v) {
	this.adj[u].add(v);
	this.adj[v].add(u);
	this.E++;	
}

public String toString(){
	StringBuilder sb=new StringBuilder();
	sb.append(V+" vertex "+E+" Edges "+"\n");
	for(int i=0;i<this.V;i++) {
		sb.append(i+": ");
		for(int j:adj[i]) {
			sb.append(j+" ");	
		}
		sb.append("\n");
	}
	return sb.toString();
}

public void bfs(int s) {
	boolean[] visited=new boolean[this.V];
	Queue<Integer> q=new LinkedList<>();
	visited[s]=true;
	q.offer(s);
	while(!q.isEmpty()) {
		int u=q.poll();
		System.out.print(u+" ");
		for(int i:adj[u]) {
			if(!visited[i]) {
				visited[i]=true;
				q.offer(i);
			}
		}
	}	
}

public void dfs(int s) {
	boolean[] visited =new boolean[this.V];
	Stack<Integer> stack=new Stack<>();
	stack.push(s);
	while(!stack.isEmpty()) {
		int u=stack.pop();
		if(!visited[u]) {
			visited[u]=true;
			System.out.print(u+" ");
			for(int i:adj[u]) {
				if(!visited[u]) {
					stack.push(i);
				}
			}
		}
	}
}

public void dfsr() {
	boolean[] visited=new boolean[this.V];
	for(int i=0;i<V;i++) {
		if(!visited[i]) {
			dfsr(i,visited);
			
		}
	}
}

private void dfsr(int i, boolean[] visited) {
	visited[i]=true;
	System.out.print(i +" ");
	for(int w:adj[i]) {
		if(!visited[w]) {
			dfsr(w,visited);
		}
	}
	
}

public static void main(String args[]) {
	GraphList l=new GraphList(4);
	l.addEdge(0, 1);
	l.addEdge(1, 2);
	l.addEdge(2, 3);
	l.addEdge(3, 0);
	System.out.println(l);
}
}
