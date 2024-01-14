package jan4;
/* 
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.



*/


//link -> https://leetcode.com/problems/longest-common-prefix/

public class jan4_longestCommonPrefix {

        public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min)
            min=strs[i].length();
        }
        int k=0;
        while(k<min){
            char a=strs[0].charAt(k);
            for(int j=1;j<strs.length;j++){
                if(a!=strs[j].charAt(k))
                return s.toString();
            }
            s=s.append(a);
            k++;
        }
        return s.toString();
    }
}   


        //Time complexity : O(n*m)  worst case -> size of strs: n and smallest string of length: m
      
        //space complexity : O(m)  worst case -> smallest String of m length

        //Approach
        /*
            *find the minimum length of string from strs
            *then check all the character of all strings one by one 
            * if its does not match then return the string s otherwise return it at end of a function
            *append current character at String s
         */

