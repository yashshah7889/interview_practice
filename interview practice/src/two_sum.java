import java.util.HashMap;

public class two_sum {
	 public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        int arr[]=new int[2];
	        for(int i=0;i<nums.length;i++){
	            if(hm.containsKey(target-nums[i])){
	                arr[0]=i;
	                arr[1]=hm.get(target-nums[i]);
	                return arr;
	            }else{
	                hm.put(nums[i],i);
	            }
	        }
	    return arr;
	    }
}
