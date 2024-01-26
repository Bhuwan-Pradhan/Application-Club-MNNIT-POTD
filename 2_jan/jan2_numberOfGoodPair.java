package jan2;
/* 
1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

*/

//link - https://leetcode.com/problems/number-of-good-pairs/

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int value=hm.getOrDefault(nums[i],0);
            count+=value;
            hm.put(nums[i],value+1);
        }
        return count;
    }
}


        //Time complexity : O(n)
        
        //space complexity : O(n)  for HashMap

        //Approach
        /*
            *First take a HashMap<Integer, Integer> and count variable
            *then get the value of key element(nums element) if not available and put it by default value 0
            *add the value to count
            *increase the value of key element
         */