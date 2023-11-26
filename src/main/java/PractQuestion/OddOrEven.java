package PractQuestion;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int x ;
        System.out.println("Enter any number " );
        Scanner in = new Scanner(System.in);
                x = in.nextInt();

                if(x %2 == 0 ){
                    System.out.println("Entered number is Even number " + x);
                }
                else {
                    System.out.println("Entered number is Odd number " + x);
                }
    }
}
