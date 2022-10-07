package array;

public class RemoveDuplicate2 {
	 public int removeDuplicates(int[] nums) {
		  if(nums.length==0) {
			  return 0;
		  }
		  int j=1;
		  nums[0]=nums[0];
		  int count=1;
		  for(int i=1;i<nums.length;i++) {
			  int temp=nums[j-1];
			  if(nums[i]==temp && count<2) {
				  nums[j]=nums[i];
				  j+=1;
				  count++;
			  }else if(nums[i]!=temp) {
				  nums[j]=nums[i];
				  j+=1;
				  count=1;
			  }
		  }
		return j;    
	    }
}
