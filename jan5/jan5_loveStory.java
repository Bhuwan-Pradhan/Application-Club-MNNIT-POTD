package jan5;
/*
 A. Love Story

time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output

Timur loves codeforces. That's why he has a string s
 having length 10
 made containing only lowercase Latin letters. Timur wants to know how many indices string s
 differs from the string "codeforces".

For example string s=
 "coolforsez" differs from "codeforces" in 4
 indices, shown in bold.

Help Timur by finding the number of indices where string s
 differs from "codeforces".

Note that you can't reorder the characters in the string s
.

Input
The first line contains a single integer t
 (1≤t≤1000
) — the number of test cases.

Each test case is one line and contains the string s
, consisting of exactly 10
 lowercase Latin characters.

Output
For each test case, output a single integer — the number of indices where string s
 differs.

Example
inputCopy
5
coolforsez
cadafurcie
codeforces
paiuforces
forcescode
outputCopy
4
5
0
4
9

 */

 //link - https://codeforces.com/contest/1829/problem/A
 

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
import java.lang.*;
public final class jan5_loveStory{
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
        String cf="codeforces";
        while(testcases-->0){
           String s=in.nextLine();
           int count=0;
           for(int i=0;i<s.length();i++){
            if(cf.charAt(i)!=s.charAt(i)){
                
                count++;
            }
            
           }
           System.out.println(count); 
        }
        
        out.close();
    }
}


        //Time complexity : O(n)  
      
        //space complexity : O(1)  

        //Approach
            /*
            * traverse in string and check each character with codeforces
            * print the count
            */