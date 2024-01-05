/*
 242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
 */

 //link - https://leetcode.com/problems/valid-anagram/description/

 
public class jan5_validAnagram {
     public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        int n=s.length();
        int[] ch=new int[26];

        for(int i=0;i<n;i++)
        ch[s.charAt(i)-'a']++;

        for(int i=0;i<n;i++)
        ch[t.charAt(i)-'a']--;

        for(int i=0;i<26;i++)
        {
            if(ch[i]!=0)
            return false;
        }
        return true;

    }
}

        //Time complexity : O(n)  
      
        //space complexity : O(1)  

        //Approach
            /*
            * take array for all 26 characters
            * increase the value of (char of String s - 'a')
            * then decrease the value of (char of String t - 'a')
            * now check the array if any non zero value present in array then return false
            * otherwise return true
            */
