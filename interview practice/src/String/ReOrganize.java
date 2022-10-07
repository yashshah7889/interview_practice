//rearrange characters in String so that two identical character doesnt come side by side if possible. if not return empty String.
//eg s="aab"        output:aba
//s="aaab"      output:""
 
package String;

import java.util.*;

public class ReOrganize {
	public String reOrganize(String s) {
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		
		//By default, priority queues are minimum priority queues according to their comparator. By doing B - A, 
		//the minimum is value such that A - B is highest,
		//as a result the highest values now have highest priority and it becomes a maximum priority queue
		PriorityQueue<Character> maxheap=new PriorityQueue<>((a,b)->m.get(b)-m.get(a));
		maxheap.addAll(m.keySet());
		StringBuilder sb=new StringBuilder();
		while(maxheap.size()>1) {
			char current=maxheap.remove();
			char next=maxheap.remove();
			sb.append(current);
			sb.append(next);
			m.put(current, m.get(current)-1);
			m.put(next, m.get(next)-1);
			if(m.get(current)>0) {
				maxheap.add(current);
			}
			if(m.get(next)>0) {
				maxheap.add(next);
			}
		}
		if(!maxheap.isEmpty()) {
			char last=maxheap.remove();
			if(m.get(last)>1) {
				return "";
			}
			sb.append(last);
		}
		return sb.toString();
	}
}
