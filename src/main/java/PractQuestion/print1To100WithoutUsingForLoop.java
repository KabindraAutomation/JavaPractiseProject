package PractQuestion;

import java.util.stream.IntStream;

public class print1To100WithoutUsingForLoop {
    public static void main(String[] args) {
        /** print 1 to 100 without using any loop
         * 1. recursive function
         * 2. java streams
         */
        //printNum(1);
        //printNum(1, 100);
        // or we can use Stream also
        IntStream.range(1,101).forEach(e-> System.out.println(e));



    }

    public static void printNum(int num) {
        if (num >= 1) {

            System.out.println(num);
            num--;
            printNum(num);
        }

    }

    public static void printNum(int stNum, int endNum) {
        if (stNum <= endNum) {

            System.out.println(stNum);
            stNum++;
            printNum(stNum, endNum);
        }
    }
}
