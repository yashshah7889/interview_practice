//put balanced l and r in a string
//lllrrr=1
//lrlrlrllrr=4---------->lr lr lr llrr

package String;

public class SplitStringinBalanced {
public int SplitString(String s) {
	int Balancedcount=0;
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='l') {
			count++;
		}
		if(s.charAt(i)=='r') {
			count--;
		}
		
		if(count==0) {
			Balancedcount++;
		}
	}
	return Balancedcount;
}
}