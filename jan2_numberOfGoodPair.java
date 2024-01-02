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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class jan2_numberOfGoodPair {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();



        

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            nums.add(number);
        }

        HashMap<Integer, Integer> hm=new HashMap<>();
        int count=0;

        for(int i=0;i<n;i++){
            int value=hm.getOrDefault(nums.get(i),0);
            count += value;
            hm.put(nums.get(i),value+1);
        }

        System.out.println(count);


        //Time complexity : O(n)
        //becuase array or list already given in question we don't count the space of nums so
        //space complexity : O(n)  for HashMap

        //Approach
        /*
            *First take a HashMap<Integer, Integer> and count variable
            *then get the value of key element(nums element) if not available and put it by default value 0
            *add the value to count
            *increase the value of key element
         */
    }
}