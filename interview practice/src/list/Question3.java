//You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. The task is to delete the node. Pointer/ reference to head node is not given. 
//Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail node in the linked list.
//
//Example 1:
//
//Input:
//N = 2
//value[] = {1,2}
//node = 1
//Output: 2
//Explanation: After deleting 1 from the
//linked list, we have remaining nodes
//as 2.
//Example 2:
//
//Input:
//N = 4
//value[] = {10,20,4,30}
//node = 20
//Output: 10 4 30
//Explanation: After deleting 20 from
//the linked list, we have remaining
//nodes as 10, 4 and 30.
package list;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question3 {
	 public String longestPalindrome(String s) {
	        char[] c=s.toCharArray();
	        String str="";
	        if(c.length<2){
	            return s;
	        }
	       for(int i=0;i<c.length-1;i++) {
	    	   int k=c.length-1;
	    	   int size = 0;
	    	  
	    	   while(i<k) {
	    		   if(c[i]==c[k]) {
	    			   boolean result=palindrome(c,i,k);
	    			   if(result==false) {
	    				   k--;
	    			   }
	    			   else {
	    				   if(size<c.length-k+1) {
	    				size=c.length-k+1;
	    				for(int t=0;t<k;t++) {
	    				str=str+c[t];
	    				
	    				   }}
	    			   }
	    		   }else
	    			   k--;
	    	   }
	       }
	       
			return str;
	    }
	 public boolean palindrome(char[] c,int i,int j) {
		 while (i < j) {
			 
	            // If there is a mismatch
	            if (c[i] != c[j])
	                return false;
	 
	            // Increment first pointer and
	            // decrement the other
	            i++;
	            j--;
	        }
	 
	        // Given string is a palindrome
	        return true;
	 }
}
