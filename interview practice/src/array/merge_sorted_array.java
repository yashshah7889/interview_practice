/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
package array;
//here we start from the back because we need to add in same array so to avoid same position problem we start from end.
public class merge_sorted_array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        //initializing a variable with the full length (we minus it by 1 because the array nums1 starts from zero)
        int length = n+m-1;
        //We do this because arrays start from zero
        m--;
        n--;
        
        //We start at the end of the arrays and compare the values
        while(m >= 0 && n >= 0){
            //if one value is larger than the other we place it in the main array nums1 and decrement the respective index (n or m)
            if(nums1[m]> nums2[n]){
                nums1[length] = nums1[m]; 
                m--;
            }else{
                nums1[length] = nums2[n];
                n--;
            }
            length--;
        }
        
        // These while loops are used to check if any of the arrays have elements left. we loop through the remaining elements and add them to the main array 
        while(m >= 0){
            nums1[length] = nums1[m];
            length--;
            m--;
        }
        
        while(n >= 0){
            nums1[length] = nums2[n];
            length--;
            n--;
        }
	}
}
