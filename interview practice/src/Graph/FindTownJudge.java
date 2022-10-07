package Graph;

import java.util.LinkedList;

public class FindTownJudge {
	LinkedList<Integer>[] lst;
	int V,E;
	
	public int findJudge(int n, int[][] trust) {
        this.lst=new LinkedList[n];
        for(int i=0;i<n;i++) {
        	lst[i]=new LinkedList<>();
        }
        int j=0;
        for(int i=0;i<trust.length;i++) {	
        		addEdge(trust[i][j],trust[i][j+1]);
        }
        for(int k=0;k<n;k++) {
        for(int i:lst[k]) {
        	
        }
        }
		return j;
    }
	public void addEdge(int u,int v) {
		this.lst[u].add(v);
	}
}
