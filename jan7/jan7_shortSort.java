package jan7;

/*
 A. Short Sort

time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output

There are three cards with letters a, b, c
 placed in a row in some order. You can do the following operation at most once:

Pick two cards, and swap them.
Is it possible that the row becomes abc
 after the operation? Output "YES" if it is possible, and "NO" otherwise.
Input
The first line contains a single integer t
 (1≤t≤6
) — the number of test cases.

The only line of each test case contains a single string consisting of each of the three characters a
, b
, and c
 exactly once, representing the cards.

Output
For each test case, output "YES" if you can make the row abc
 with at most one operation, or "NO" otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Example
inputCopy
6
abc
acb
bac
bca
cab
cba
outputCopy
YES
YES
YES
NO
NO
YES
Note
In the first test case, we don't need to do any operations, since the row is already abc
.

In the second test case, we can swap c
 and b
: acb→abc
.

In the third test case, we can swap b
 and a
: bac→abc
.

In the fourth test case, it is impossible to make abc
 using at most one operation.
 */

 //link - https://codeforces.com/contest/1873/problem/A

 import java.util.*;
public final class jan7_shortSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     
        int testcases=sc.nextInt();
        while(testcases-->0){
           String s=sc.next();
        
           if(s.charAt(0)=='b' && s.charAt(2)=='a')
           System.out.println("NO");
           else if(s.charAt(0)=='c' && s.charAt(2)=='b')
           System.out.println("NO");
           else
           System.out.println("YES");
        }
        
    }
}

        //Time complexity : O(1)  
      
        //space complexity : O(1)  

        //Approach
            /*
            * if charAt 0 == b and charAt 2 == a then NO
            * if charAt 0 == c and charAt 2 == b then NO
            * Otherwise Yes
            */
