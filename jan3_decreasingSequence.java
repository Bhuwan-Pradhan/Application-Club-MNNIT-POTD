/* 
Decreasing Sequence

A sequence a[0], a[1], …, a[N-1] is called decreasing if a[i] >= a[i+1] for each i: 0 <= i < N-1. You are given a sequence of numbers a[0], a[1],…, a[N-1] and a positive integer K. In each 'operation', you may subtract K from any element of the sequence. You are required to find the minimum number of 'operations' to make the given sequence decreasing.
Note: As the answer can be large return your answer modulo 109+7.

 

Example 1:

Input:
N = 4, K = 5
A[] = {1, 1, 2, 3}
Output:
3
Explanation:
One operation is required to change a[2] = 2
into -3 and two opertations are required to
change a[3] = 3 into -7. The resulting
sequence will be 1 1 -3 -7. Hence, in
total 3 operations are required.
 

Example 2:

Input:
N=5, K = 2
A[] = {5, 4, 3, 2, 1}
Output:
0
Explanation:
The sequence is already decreasing. Hence,
no operations are required in both the cases.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function minMoves() which takes the array A[], its size N and an integer K as inputs and returns the minimum number of ‘operations’. Return your answer modulo 109+7.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 106
1 <= K <= 100
-106 <= a[] <= 106

*/


import java.util.Scanner;

public class jan3_decreasingSequence {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

       

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        System.out.println("Enter the value of K");
        long k=sc.nextInt();        

        int[] a=new int[n];

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            a[i]=number;
        }

         double mod=1e9+7;
       
       long count=0;
       long oper=0;
       
       for(long i=0;i<n-1;i++){
           if(a[(int)i]<a[(int)i+1]){
               long diff=a[(int)i+1]-a[(int)i];
               if(diff%k==0){
                   oper=diff/k;
               }
               else{
                   oper=diff/k+1;
               }
               
               count+=oper;
               a[(int)i+1]=a[(int)i+1]-(int)(oper*k);
           }
       }
       System.out.println((long)(count%mod));

        //Time Complexity: O(n)
         
        //becuase array or list already given in question we don't count the space of nums so
        //space Complexity: O(1)

        //Approach
        /*
         * first we take variable oper for operation and count
         * if a[i]<a[i+1] then find the difference and quotient of diff and k
         * if quotient is 0 then oper is quotient else oper is quotient+1
         * at last add oper in count and change the value of a[i+1]=a[i+1]-(oper*k)
         */
    }
}