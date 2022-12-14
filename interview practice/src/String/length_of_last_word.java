/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
package String;

public class length_of_last_word {
	 public int lengthOfLastWord(String s) {
	        int count=0;
	        s=s.trim();
	        for(int i=s.length()-1;i>=0;i--){
	            if(s.charAt(i) != ' '){
	                count++;
	            }else{
	                break;
	            }
	        }
	        return count;
	    }
}
