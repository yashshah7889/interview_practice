 package String;

import java.util.HashMap;
import java.util.Map;

public class FindOccurance {
	public static void main(String args[]) {
		String str="AABCDBE";
		char[] arr=str.toCharArray();
		Map<Character,Integer> m=new HashMap();
		for(char ch:arr) {
			if(!m.containsKey(ch)) {
				m.put(ch, 1);
			}else {
				int i=m.get(ch);
				m.put(ch, i+1);
			}
		}
		System.out.println(m);
	}
}