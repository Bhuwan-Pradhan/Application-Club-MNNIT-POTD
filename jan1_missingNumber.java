import java.util.ArrayList;
import java.util.Scanner;

public class jan1_missingNumber {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            nums.add(number);
        }

        long sum=0; // sum of all element
        long actualSum= (n*(n+1))/2; //series of 1 to n

        for(int i=0;i<n;i++){
            sum += nums.get(i);
        }

        int missingNumber=(int)(actualSum-sum);

        System.out.println("Missing Number is: "+missingNumber);

        //Time Complexity: O(n)
         
        //becuase array or list already given in question we don't count the space of nums so
        //space Complexity: O(1)

        //Approach
        /*
         * first find the sum of all element
         * then find actual sum using formula
         * at last minus sum from actual sum 
         * we get your missing number
         */
    }
}