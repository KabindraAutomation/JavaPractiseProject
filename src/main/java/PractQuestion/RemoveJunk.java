package PractQuestion;

import java.util.Scanner;

public class RemoveJunk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter String along with special characters : "+ s);
        //Regular expression need to use [^a-z, A- Z, 0 - 9]
        //using replaceAll() method we have

        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);


    }
}
