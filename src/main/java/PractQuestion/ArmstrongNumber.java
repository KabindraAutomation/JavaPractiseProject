package PractQuestion;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n, arm =0, r, c;
        System.out.println("Enter any number ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        c= n;

        while(n>0){
            r = n % 10;
            arm = (r*r*r) + arm;
            n=n/10;
        }
        if(c == arm){
            System.out.println("Entered number is armstrong");
        }
        else {
            System.out.println("Entered number is not armostrong");
        }



    }
}
