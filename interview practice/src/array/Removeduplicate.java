//sorted array

package array;

public class Removeduplicate {
	  public int removeDuplicates(int[] nums) {
		  if(nums.length==0) {
			  return 0;
		  }
		  int j=1;
		  nums[0]=nums[0];
		  for(int i=1;i<nums.length;i++) {
			  int temp=nums[j-1];
			  if(nums[i]!=temp) {
				  nums[j]=nums[i];
				  j+=1;
			  }
		  }
		return j;
	        
	    }
}
