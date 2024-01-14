package jan3;
/* 
169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

*/


//link - https://leetcode.com/problems/majority-element/

import java.util.HashMap;



class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        int condition=n/2;

        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            int value=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],value+1);
        }

        for(int i=0;i<n;i++){
            int value=hm.get(nums[i]);
            if(value>condition)
            return nums[i];
 
        }        

        return -1;
    }
}  

        

        //Time Complexity: O(n)
         
        //becuase array or list already given in question we don't count the space of nums so
        //space Complexity: O(n)  for HashMap

        //Approach
        /*
         * first we take hashMap and a condition
         * then check value of all key which is more than condition
         */
