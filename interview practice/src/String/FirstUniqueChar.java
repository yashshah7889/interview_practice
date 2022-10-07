//Problem description: Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
//
//Note: You may assume the string contain only lowercase letters.
package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueChar {
	public static int uniqueChar(String s) {
		char[] c=s.toCharArray();
		int index=0;
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		if(s.length()==1) {
			return 1;
		}else if(s.length()==0) {
			return -1;
		}
		for(int i=0;i<s.length();i++ ) {
			if(!hm.containsKey(c[i])) {
				hm.put(c[i], i);
			}
			else {
				 hm.put(c[i],-1);
			}
			System.out.println(hm);
		if(i==s.length()-1) {
			int x=Integer.MAX_VALUE;
				for(Character x1:hm.keySet()) {
					if((hm.get(x1))>-1&& hm.get(x1)<x) {
						x=(hm.get(x1));
					}
			}
				if(x!=Integer.MAX_VALUE)
				return x;
			}
		}
		if(hm.isEmpty()) {
			return -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int x=uniqueChar("AAAAAAAb");
		System.out.println(x);
	}
}
