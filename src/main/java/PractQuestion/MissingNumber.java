package PractQuestion;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //how to find missing number in Array
        int a[] = { 1,2,4,5};
        /* logic for this
        add given number in array 1+2+4+5 = 12;
        now add 1 to 5 = 1+2+3+4+5 = 15
        now subtract 15-12 = 3, so 3 is missing
         */
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum =sum + a[i];

        }
                System.out.println(sum);
        int sum1= 0;
        for(int j = 1; j<=5; j++){
            sum1 = sum1+ j;
        }
        System.out.println(sum1);
        int missingNunber = sum1 - sum;
        System.out.println("Missing Number in array "+ missingNunber);
    }

}
