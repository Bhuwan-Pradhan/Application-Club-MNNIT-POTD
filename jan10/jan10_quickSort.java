/*
 B. Quick Sort
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are given a permutation†
 p
 of length n
 and a positive integer k≤n
.

In one operation, you:

Choose k
 distinct elements pi1,pi2,…,pik
.
Remove them and then add them sorted in increasing order to the end of the permutation.
For example, if p=[2,5,1,3,4]
 and k=2
 and you choose 5
 and 3
 as the elements for the operation, then [2,5,1,3,4]→[2,1,4,3,5]
.

Find the minimum number of operations needed to sort the permutation in increasing order. It can be proven that it is always possible to do so.

†
 A permutation of length n
 is an array consisting of n
 distinct integers from 1
 to n
 in arbitrary order. For example, [2,3,1,5,4]
 is a permutation, but [1,2,2]
 is not a permutation (2
 appears twice in the array), and [1,3,4]
 is also not a permutation (n=3
 but there is 4
 in the array).

Input
The first line contains a single integer t
 (1≤t≤104
) — the number of test cases. The description of test cases follows.

The first line of each test case contains two integers n
 and k
 (2≤n≤105
, 1≤k≤n
).

The second line of each test case contains n
 integers p1,p2,…,pn
 (1≤pi≤n
). It is guaranteed that p
 is a permutation.

It is guaranteed that the sum of n
 over all test cases does not exceed 105
.

Output
For each test case output a single integer — the minimum number of operations needed to sort the permutation. It can be proven that it is always possible to do so.

Example
inputCopy
4
3 2
1 2 3
3 1
3 1 2
4 2
1 3 2 4
4 2
2 3 1 4
outputCopy
0
1
1
2
Note
In the first test case, the permutation is already sorted.

In the second test case, you can choose element 3
, and the permutation will become sorted as follows: [3,1,2]→[1,2,3]
.

In the third test case, you can choose elements 3
 and 4
, and the permutation will become sorted as follows: [1,3,2,4]→[1,2,3,4]
.

In the fourth test case, it can be shown that it is impossible to sort the permutation in 1
 operation. However, if you choose elements 2
 and 1
 in the first operation, and choose elements 3
 and 4
 in the second operation, the permutation will become sorted as follows: [2,3,1,4]→[3,4,1,2]→[1,2,3,4]
.


 */

 //link - https://codeforces.com/problemset/problem/1768/B

 import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
import java.lang.*;
public final class B_Quick_Sort{
    public static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
            if (System.getProperty("ONLINE_JUDGE")== null) {
                try {
                   br = new BufferedReader(
                        new InputStreamReader(
                            new FileInputStream(
                                "input.txt")));
                }
                catch (Exception e) {
                }
            }
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
   
        }}
    public static class FastWriter {
         BufferedWriter bwr;
         public FastWriter() {
            bwr = new BufferedWriter(new OutputStreamWriter(System.out));
            if (System.getProperty("ONLINE_JUDGE")== null) {
                try {
                bwr = new BufferedWriter(
                        new OutputStreamWriter(
                            new FileOutputStream(
                                "output.txt")));
                }
                catch (Exception e) {
                }
            }
        }
        public void print(Object object) throws IOException {
            bwr.append("" + object);
        }
        public void println(Object object) throws IOException {
            print(object);
            bwr.append("\n");
        }
        public void close() throws IOException {
            bwr.close();
        }}
    public static void main(String... args)throws Exception{
        FastReader in=new FastReader();
        FastWriter out=new FastWriter();
        int MOD = (int) (1e9 + 7);
        int testcases=in.nextInt();
        while(testcases-->0){
           int n=in.nextInt();
           int k=in.nextInt();
           int arr[]=new int[n];
           int j=0;
           for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
                if(arr[i]==1)
                j=i;
           }
    
           int count=0;
     
           for(int i=j;i<n;i++){
                if(count+1==arr[i]){
                    count++;
                }
                
           }
           count=n-count;
         
           if(count%k==0){
            System.out.println(count/k);
           }
           else{
            System.out.println(count/k+1);
           }
        }
        
        out.close();
    }
}