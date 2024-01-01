import java.util.ArrayList;
import java.util.Scanner;

public class jan1_findSecondLargest {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();



        

        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            nums.add(number);
        }

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        


        for(int i=0;i<n;i++){
            if(nums.get(i)>max){

                if(max>secondMax)
                secondMax=max;

                max=nums.get(i);
                
            }
            if(nums.get(i)>secondMax && nums.get(i)<max){
                secondMax=nums.get(i);
            }
        }

        if(n==1){
            System.out.println(nums);
            System.out.println("second largest does not exist");
        }


        else{
        System.out.println(nums);
        System.out.println("Second largest element is: "+secondMax);
        }


        //Time complexity : O(n)
        //becuase array or list already given in question we don't count the space of nums so
        //space complexity : O(1)

        //Approach
        /*
         * first initialize max and secondMax : minimum value of Integer
         * check if the element is greater than max if yes then check if the max is greater than second max if yes than change the value of secondMax with max after that change the value of max with current element
         * check if the element is greater than secondMax and less than max if yes then change the value of second element with current element
         * At last check if the length of nums is 1 then second largest does not exist
         * else print the second largest is console
         */
    }
}