package jan6;
/*
 45. Jump Game II

You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 1000
It's guaranteed that you can reach nums[n - 1].

 */

 //link - https://leetcode.com/problems/jump-game-ii/description/


 class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0;
        int last=0;
        int coverage=0;

        for(int i=0;i<n-1;i++){
            coverage=Math.max(coverage, i+nums[i]);
            if(i==last){
                jumps++;
                last=coverage;
            }
        }
        
        return jumps;
    }
}

        //Time complexity : O(n)  
      
        //space complexity : O(1)  

        //Approach
            /*
            * traverse to index 0 to n-2
            * find the maximum coverage for all index
            * if index is became last then increment the jumps change the value of last to coverage
            */