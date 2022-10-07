//given array compress array in it place.
//every element should be character itself
//length after compression must be smaller or equal to original.
//space complexity:-o(1).

//example1 :[a,a,b,b,c,c,c]
//output:[a,2,b,2,c,3].
//eg2 ;[a,b,b,b,b,b,b,b,b,b,b,b,b]
//output:[a,b,1,2]

package String;

public class StringCompression {
	
	public int compress(char[] c) {
		int index=0;
		for(int i=0;i<c.length;i++) {
			int j=i;
			for( j=i;j<c.length;j++) {
				if(c[i]==c[j]) {}
				else {
					break;
				}
				
			}
			c[index++]=c[i];
			if(j-i>1) {
			String count=j-i+"";
			for(char b:count.toCharArray()) {
				c[index++]=b;
			}
			}
			i=j;
		}
		
		return index;
		
	}

}
