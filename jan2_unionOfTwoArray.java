/* 
Union of two arrays

Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class jan2_unionOfTwoArray {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> nums1=new ArrayList<>();
        ArrayList<Integer> nums2=new ArrayList<>();

        System.out.println("Enter the number of elements in nums1");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            nums1.add(number);
        }

        System.out.println("Enter the number of elements in nums2");
        int m=sc.nextInt();

        for(int i=0;i<m;i++){
            int number=sc.nextInt();
            nums2.add(number);
        }

        HashSet<Integer> set=new HashSet<>();

        for(int number:nums1){
            set.add(number);
        }

        for(int number:nums2){
            set.add(number);
        }

        System.out.println(set);
        System.out.println("number of element in union: "+set.size());





        //Time complexity : O(n+m)
        //becuase array or list already given in question we don't count the space of nums so
        //space complexity : O(n+m)  for HashSet

        //Approach
        /*
            *First take a HashSet<Integer>
            *then add the elements of both list nums1 and nums2 in set
         */
    }
}