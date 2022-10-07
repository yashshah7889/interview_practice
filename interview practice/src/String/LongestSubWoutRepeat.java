package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubWoutRepeat {
	public static void main(String args[]) {
	System.out.println(solution("cat"));	
	}

	private static String solution(String S) {
		int result=0,newresult=0;
		String k="";
	 	
	 	for(int i=0;i<S.length();i++) {
	 		
	 		newresult=Math.max(newresult,S.lastIndexOf(S.charAt(i))-i);
	 		if(result!=newresult) {
	 			k=S.substring(i, S.lastIndexOf(S.charAt(i))+1);
	 		}
	 		result=newresult;
	 	}
	 	if(result ==0) {
	 		return S.charAt(0)+"";
	 	}
	    return k;
	  }
		
		
	
		
	}
