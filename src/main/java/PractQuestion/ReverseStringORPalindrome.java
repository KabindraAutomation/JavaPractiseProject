package PractQuestion;

public class ReverseStringORPalindrome {

    public static void main(String[] args) {
        String s = "Selenium";
        int len = s.length();
        String rev = "";

        for(int i = len-1; i>=0; i--){
            rev = rev + s.charAt(i);

        }
        if(rev.equals(s)){
            System.out.println("Word is palindrome");
        }
        else {
            System.out.println("Word is not palindrome");
        }
        System.out.println("Using String method only : " + rev);

        //2. Using SrtingBuffer class:
        StringBuffer sf = new StringBuffer(s);
        System.out.println("Using String Buffer Method : " + sf.reverse());

    }



}
