package array;

class Solution {
   	 public int searchInsert(int[] nums, int target) {
		if(nums.length==1) {
		if(nums[0]<target) {
			return 1;
			}	else {
			return 0;
			}
		}
		int i=0,j=nums.length-1;
		while(i<=j) {
			if(nums[i]==target || nums[j]==target) {
				if(nums[i]==target) {
					return i;
				}
				else {
					return j;
				}
			}
			if(nums[i]>target || nums[j]<target ) {
				if(nums[i]>target) {
					return i;
				}else if(nums[j]<target){
					return j+1;
				}
			}
			i++;
			j--;
		}
		if(nums[i]>target && nums[j]<target) {
			return j+1;
		}
		return 0;
		}
}