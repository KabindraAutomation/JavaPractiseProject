package PractQuestion;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {
    public static void main(String[] args) {
        int numbers[]= { -88, 24,50,5688888,88,-7,8888};
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }else if (numbers[i]<smallest){
                smallest = numbers[i];
            }

        }
        System.out.println("Give Array" + Arrays.toString(numbers));
        System.out.println("Largest nunmber "+ largest);
        System.out.println("Smallest number " + smallest);


    }
}
