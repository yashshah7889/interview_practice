package array;

public class FirstBadVersion {
	 public int firstBadVersion(int n) {
		 if(n==1) {
			 return 1;
		 }
		 int i=0,j=n;
		int k=find(n,i,j);
		 
		return n;
	        
	    }

	private int find(int n, int i, int j) {
		int t;
		int mid=(int) Math.floor((i+j)/2);
		if(i==mid ||j==mid) {
			if(isBadVersion(mid))
			return mid;
			else
				return mid+1;
		}
		
		if(isBadVersion(mid)) {
			t=find(n,i,mid-1);
		}
		else {
			t=find(n,mid,j);
		}
		return t;
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
