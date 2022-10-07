package String;

import java.util.HashMap;
import java.util.Map;

public class RemoveArray {
	 public int removeDuplicates(int[] nums) {
		 int count=0;
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		 for(int i=0;i<nums.length;i++) {
			 if(!m.containsValue(nums[i])) {
				 m.put(count,nums[i]);
				 count++;
			 }
			 
		 }
		 for(int j=0;j<m.size();j++) {
			 nums[j]=m.get(j);
		 }
		        
		  
		 return count;  
	    }
	 
}
