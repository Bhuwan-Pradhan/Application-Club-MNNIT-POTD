/*
 Second Largest

Given an array Arr of size N, print second largest distinct element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arri ≤ 105
 */

 //link - https://www.geeksforgeeks.org/problems/second-largest3735/1
 
package jan1;

class Solution {
    int print2largest(int arr[], int n) {
        int max=Integer.MIN_VALUE;
        int secondMax=-1;

        


        for(int i=0;i<n;i++){
            if(arr[i]>max){

                if(max>secondMax)
                secondMax=max;

                max=arr[i];
                
            }
            if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}


        //Time complexity : O(n)
        
        //space complexity : O(1)

        //Approach
        /*
         * first initialize max and secondMax : minimum value of Integer
         * check if the element is greater than max if yes then check if the max is greater than second max if yes than change the value of secondMax with max after that change the value of max with current element
         * check if the element is greater than secondMax and less than max if yes then change the value of second element with current element
         * At last check if the length of nums is 1 then second largest does not exist
         * else print the second largest is console
         */
    
