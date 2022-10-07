//You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.
//
//If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
//
//Return the maximum coins you can collect by bursting the balloons wisely.
//
// 
//
//Example 1:
//
//Input: nums = [3,1,5,8]
//Output: 167
//Explanation:
//nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
//coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
//Example 2:
//
//Input: nums = [1,5]
//Output: 10
// 
//Constraints:
//
//n == nums.length
//1 <= n <= 500
//0 <= nums[i] <= 100

package list;

import java.util.Scanner;

public class Question4 {
	
	public int ballons(int[] arr) {
		int n=arr.length;
		int[] bal=new int[n+2];
		bal[0]=1;
		bal[bal.length-1]=1;
		for(int i=1;i<=n;i++) {
			bal[i]=arr[i-1];
		}
		
		
		return 0;
		
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter nymber of ballons");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Question4 q=new Question4();
		int result=q.ballons(arr);
		System.out.println("result is "+result);
	}
}
