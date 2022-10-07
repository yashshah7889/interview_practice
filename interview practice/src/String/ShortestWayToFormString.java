//shortest way to string
//form any String,we can form subsequence of string by deleting some number of character

//given two string source and target retrun minimum number of subsequence of source so to concaninate and form equals target. 
//source: abc target:abcbc output:2 as abc+bc
//source:abc target:adbcc output -1.

package String;

public class ShortestWayToFormString {
	public int formString(String s,String t) {
		int count=0;
		String remaining=t;
		//sStringBuilder sb =new StringBuilder();
		while(remaining.length()>0) {
			StringBuilder sb =new StringBuilder();
			int i=0;
			int j=0;
			while(i<s.length()&&j<remaining.length()) {
				if(s.charAt(i)==remaining.charAt(j)) {
					sb.append(remaining.charAt(j));
					j++;
				}else {
					i++;
				}
			}
			if(sb.length()==0) {
				return -1;
			}
			count++;
			remaining=	remaining.substring(sb.length());
			}
		
		return count;
		
	}
}
