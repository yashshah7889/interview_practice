
package array;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        int result= nums[0];
        for(int i=1;i<nums.length;i++){
            result=result^nums[i];// ^ means XOR which is used for so if number are same will result in 0 which is false.
        }
        return result;
    }
}
