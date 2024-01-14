package jan4;
/*
796. Rotate String

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 

Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
 */

 //link -> https://leetcode.com/problems/rotate-string/description/

public class jan4_rotateString {
        public boolean rotateString(String s, String goal) {
        if(goal.length()<s.length())
        return false;
        goal=goal+goal;

        if(goal.contains(s))
        return true;
        return false;
    }
}

        //Time complexity : O(n)  for contains function
     
        //space complexity : O(m)  length of goal

        //Approach
        /*
            * add goal and goal
            * then check final goal contains s if yes then true else false
         */
