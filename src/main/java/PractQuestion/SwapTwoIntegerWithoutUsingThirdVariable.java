package PractQuestion;

public class SwapTwoIntegerWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        //1.Using third var : t
//        int t;
//        t= x;
//        x= y;
//        y = t;

        //2. Without using third var:
//        x = x + y;
//        y = x - y ;
//        x = x - y;

        //3. Without using third var : using * operator
        x= x * y;
        y = x/y;
        x= x / y;

        System.out.println("Value of x after swap " + x);
        System.out.println("Value of y after swap " + y);

    }
}
