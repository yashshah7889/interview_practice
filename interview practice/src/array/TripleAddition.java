package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleAddition {
	
	    public static List<List<Integer>> threeSum(int[] nums) {
	    	   List<List<Integer>> result=new ArrayList<List<Integer>>();
		        Arrays.sort(nums);
		        
		        for(int i=0;i<nums.length  && nums[i]<=0;i++){
		        	int j=i+1,k=nums.length-1;
		        while(j<k){
		            int sum=nums[i]+nums[j]+nums[k];
		            List<Integer> set=new ArrayList<>();
		            if(sum==0){
		                
		                set.add(nums[i]);
		                set.add(nums[j]);
		                set.add(nums[k]);
		               
		               if(!result.contains(set)) {
		                result.add(set);}
	                    k--;
	                    j++;
		                
		            }
		            else if(sum>0){
		                k--;
		            }else{
		                j++;
		            }
		        }
		        }
		        return result;
	    }
	    
	    public static void main(String[] args) {
	    	int[] arr=new int[] {-1,0,1,2,-1,-4};
	    	threeSum(arr);
			
		}
	}

//List<List<Integer>> ans =new ArrayList<>();
//
//Arrays.sort(nums);
//// --  if current valu > 0 it won't give sum as 0
//for(int i =0 ;i <nums.length && nums[i]<=0; i++){
//    
//    //-- If the current value is the same as the one before, skip it.
//    if( i == 0 || nums[i-1]!=nums[i] )
//    {  
//        twoSum(nums,i,ans);
//     }
//}
//return ans;
//}
//
//public void twoSum (int[]  nums , int i ,List<List<Integer>> ans)
//{
//
//int lo = i+1;
//int hi = nums.length-1;
//
//
//while(lo < hi ){
//    
//    int sum = nums[i]+nums[lo]+nums[hi];
//    
//    if(sum<0)
//    {
//        lo++;
//    }
//    else if(sum >0 )
//    {
//        hi--;
//    }
//    else{
//        ans.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
//        // -- Increment lo while the next value is the same as before to avoid                               duplicates in the result.
//        while(lo<hi && nums[lo]==nums[lo-1])
//            lo++;
//    }
//}
//}