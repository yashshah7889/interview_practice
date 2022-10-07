//In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
//
//Return the maximum amount of gold you can collect under the conditions:
//
//Every time you are located in a cell you will collect all the gold in that cell.
//From your position, you can walk one step to the left, right, up, or down.
//You can't visit the same cell more than once.
//Never visit a cell with 0 gold.
//You can start and stop collecting gold from any position in the grid that has some gold.

package Graph;

public class PathWithMaximumGold {
  public int getMaximumGold(int[][] grid) {
	  if(grid==null||grid.length==0)
		  return 0;
	  int max=0,m=grid.length,n=grid[0].length;
	  for(int i=0;i<m;i++) {
		  for(int j=0;j<n;j++) {
			  if(grid[i][j]>0) {
				  int gold=findMaxGold(grid,i,j,m,n,new boolean[m][n]);
				  max=Math.max(max,gold);
			  }
		  }
	  }
	  
	  return max;  
  }

private int findMaxGold(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
	//out of bounds
	//visited i and j are true
	//grid[i][j] are 0
	if(i<0||j<0||i>=m||j>=n||grid[i][j]==0||visited[i][j]) 	return 0;
	visited[i][j]=true;
	int left=findMaxGold(grid,i,j-1,m,n,visited);
	int right=findMaxGold(grid,i,j+1,m,n,visited);
	int up=findMaxGold(grid,i-1,j,m,n,visited);
	int down=findMaxGold(grid,i+1,j,m,n,visited);
	visited[i][j]=false;
	return Math.max(left, Math.max(right, Math.max(up, down)))+grid[i][j];
}
}
