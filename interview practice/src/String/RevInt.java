package String;

public class RevInt {
	 public int reverse(int x) {
	        boolean negative=false;
	        if(x<0) {
	        	negative=true;
	        	x*=-1;
	        }
	        
	        long reversed=0;
	        while(x>0) {
	        	reversed=(reversed*10)+(x%10);
	        	x/=10;
	        }
	        
	        if(reversed>Integer.MAX_VALUE) {
	        	return 0;
	        }//to check 32 bit thing.
	        
			return negative?(-1)*(int)reversed:(int)reversed;
	    }
}
