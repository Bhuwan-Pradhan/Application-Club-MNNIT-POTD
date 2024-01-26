/*
 3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

 //link - https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=list&envId=rrssge1g

 class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        int i=0,j=0;
        while(j<s.length()){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            if(hm.size()==j-i+1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(hm.size()<j-i+1){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0) hm.remove(s.charAt(i));
                i++;
                j++;
            }
        }
        return max;
    }
}

