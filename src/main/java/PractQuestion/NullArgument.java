package PractQuestion;

public class NullArgument {

    /**
     * Pass null argument with method overloading with string and object types
     */

    public static void main(String[] args) {
        test(null);
    }
public static void test(Object o){
    System.out.println("Object Argument");
}
public static void test(String a){
    System.out.println("String Argument");
}

}
