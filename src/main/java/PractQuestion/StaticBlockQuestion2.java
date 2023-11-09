package PractQuestion;

public class StaticBlockQuestion2 {

    //How can we run a java program without making any object?
    public static void main(String[] args) {
        System.out.println("Main Block");
        test();
        StaticBlockQuestion2.test();
    }
    static {
        System.out.println("Static Block1");
    }

    public static void test(){
        System.out.println("testing method");
    }

}
