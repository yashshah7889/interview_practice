package String;

import java.util.Stack;

public class OpenCloseBracket {
	
	    public boolean isValid(String s) {
	      
	        
	        char[] c=s.toCharArray();
	        Stack<Character> sa=new Stack<Character>();
	        for(int i=0;i<c.length;i++) {
	        if(c[i]=='(') {
	        	sa.push(')');
	        }else if(c[i]=='{') {
	        	sa.push('}');
	        }else if(c[i]=='[') {
	        	sa.push(']');
	        }else if(sa.isEmpty()||sa.pop()!=c[i]);
	        	{return false;}
	        }
	        return sa.isEmpty(); 
	    }
	}
