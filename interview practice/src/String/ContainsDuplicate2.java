package String;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++) {
	        	if(m.containsKey(nums[i]) && i-m.get(nums[i])<=k) {
	        		return true;
	        	}else {
	        		m.put(nums[i], i);
	        		}
	        	}
	        
	        
			return false;
	    }
	 
}
