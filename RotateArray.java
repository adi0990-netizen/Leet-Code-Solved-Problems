package Arrays;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

public class RotateArray{
	public static void swap (int[] nums,int start, int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(int[] nums, int k) {
		
		k=k%nums.length;
		if(k==0) {
			return;
		}
		
		swap(nums,0,nums.length-1);
		swap(nums,0,k-1);
		swap(nums,k,nums.length-1);
	}
		
	
	
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		rotate(nums,3);
		for(int ele:nums) {
			System.out.print(ele+" ");
		}
		
	}

}
