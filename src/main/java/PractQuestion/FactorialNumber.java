package PractQuestion;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int n, c = 1, fact = 1;
        Scanner in = new Scanner(System.in);
        n= Integer.parseInt(in.nextLine());


        for (c = 1; c<=n; c++ ){
            fact = fact * c;
        }
        System.out.println("Factorial of " +n+ " is = "+ fact);
    }
}
