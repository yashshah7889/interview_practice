package list;

public class Question5 {
	
	
	public static void main(String[] args) {
		 String s="ababbcbc";
		 longestCommonPrefix( s);
		 }

	private static String[] longestCommonPrefix(String s) {
		int n=s.length();
		//String[] str=new String[(n*(n+1))/2];
		  for (int i = 0; i < n; i++)
	           for (int j = i+1; j <= n; j++) {
	              String k= s.substring(i, j);
	              
	           }
		return null;
	}
}
