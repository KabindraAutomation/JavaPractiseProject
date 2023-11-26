package PractQuestion;

import java.util.Scanner;

public class ReversAnInteger {
    public static void main(String[] args) {
        int num ;// output = 65321
        System.out.println("Enter the number to reverse ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num/ 10;
        }
        System.out.println(rev);


        // 2. Using StringBuffer method
//        long num1 = 12345;
//        System.out.println("Enter number is "+ num1);
//        StringBuffer reverse = new StringBuffer(String.valueOf(num1)).reverse();
//        System.out.println("Integer reverse using string buffer " + reverse );
    }
}
