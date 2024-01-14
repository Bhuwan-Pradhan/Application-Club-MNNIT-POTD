package jan6;
/*
 A. New Palindrome
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output

A palindrome is a string that reads the same from left to right as from right to left. For example, abacaba, aaaa, abba, racecar are palindromes.

You are given a string s
 consisting of lowercase Latin letters. The string s
 is a palindrome.

You have to check whether it is possible to rearrange the letters in it to get another palindrome (not equal to the given string s
).

Input
The first line contains a single integer t
 (1≤t≤1000
) — the number of test cases.

The only line of each test case contains a string s
 (2≤|s|≤50
) consisting of lowercase Latin letters. This string is a palindrome.

Output
For each test case, print YES if it is possible to rearrange the letters in the given string to get another palindrome. Otherwise, print NO.

You may print each letter in any case (YES, yes, Yes will all be recognized as positive answer, NO, no and nO will all be recognized as negative answer).

Example
inputCopy
3
codedoc
gg
aabaa
outputCopy
YES
NO
NO

Note
In the first test case, it is possible to rearrange the letters in the palindrome codedoc to obtain the string ocdedco, which is different from the given string, but also a palindrome.

 */

 //link - https://codeforces.com/contest/1832/problem/A



import java.io.*;
import java.util.StringTokenizer;

public final class jan6_newPalindrome{
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
   
        int testcases=in.nextInt();
        while(testcases-->0){
           String s=in.nextLine();
           int n=s.length()/2;
           boolean notFound=true;
           for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.println("YES");
                notFound=false;
                break;
            }
           }
           if(notFound)
           System.out.println("NO");
        }
        
        out.close();
    }
}


        //Time complexity : O(n)  
      
        //space complexity : O(1)  

   
