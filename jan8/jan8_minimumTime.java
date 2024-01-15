package jan8;

/* 
 1578. Minimum Time to Make Rope Colorful

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful.

 

Example 1:


Input: colors = "abaac", neededTime = [1,2,3,4,5]
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3.
Example 2:


Input: colors = "abc", neededTime = [1,2,3]
Output: 0
Explanation: The rope is already colorful. Bob does not need to remove any balloons from the rope.
Example 3:


Input: colors = "aabaa", neededTime = [1,2,3,4,1]
Output: 2
Explanation: Bob will remove the balloons at indices 0 and 4. Each balloons takes 1 second to remove.
There are no longer two consecutive balloons of the same color. Total time = 1 + 1 = 2.
 

Constraints:

n == colors.length == neededTime.length
1 <= n <= 105
1 <= neededTime[i] <= 104
colors contains only lowercase English letters.
 */

 //link - https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/

 class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
       
        for(int i=0;i<colors.length()-1;i++){
            int k=i;
            int j=i+1;
            while(j<colors.length() && colors.charAt(k)==colors.charAt(j)){
                if(neededTime[k]<neededTime[j]){
                    time +=neededTime[k];
                    k=j;
                    j++;
                }
                else{
                    time +=neededTime[j];
                    j++;
                }
            }
            i=j-1;
        }
        return time;
    }
}

        //Time complexity : O(n)  
      
        //space complexity : O(1)  

        //Approach
            /*
            * first find the same color let 'a' then find minimum taken time to remove 'a' till there exist only one color of 'a'
            * if k is small then add time of k and change to  k=j and j++ else then j will small then add time of j and change to j++
            * and change value of i to j-1
            */