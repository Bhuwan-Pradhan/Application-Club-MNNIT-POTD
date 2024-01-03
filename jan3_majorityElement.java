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


import java.util.HashMap;
import java.util.Scanner;

public class jan3_majorityElement {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

       

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
      

        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            nums[i]=number;
        }

         

        int condition=n/2;

        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            int value=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],value+1);
        }

        for(int i=0;i<n;i++){
            int value=hm.get(nums[i]);
            if(value>condition)
            System.out.println(nums[i]);
 
        }        

        

        //Time Complexity: O(n)
         
        //becuase array or list already given in question we don't count the space of nums so
        //space Complexity: O(n)  for HashMap

        //Approach
        /*
         * first we take hashMap and a condition
         * then check value of all key which is more than condition
         */
    }
}