package array;

import java.util.HashMap;

public class contains_duplicate {
	 public boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(hm.containsKey(nums[i])){
	                return true;
	            }else{
	                hm.put(nums[i],i);
	            }
	        }
	        return false;
	    }
}
