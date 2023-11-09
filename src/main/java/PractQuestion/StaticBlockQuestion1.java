package PractQuestion;

public class StaticBlockQuestion1 {

    //Explan static block in Java==> it can be execute before main method
    public static void main(String[] args) {
        System.out.println("Main Block");
    }
    static {
        System.out.println("Static Block1");
    }
    static {
        System.out.println("Static Block2");
    }
}
