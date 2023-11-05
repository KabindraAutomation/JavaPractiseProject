package OOPsConcept;

import jdk.swing.interop.SwingInterOpUtils;

public class WrapperClass {

    public static void main(String[] args) {
        String x= "100";
        System.out.println(x+20);

        //data conversion: String to int
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //Integer, Double, Character, Bollean

        //String to double conbversion:
        String y = "12.33";
       double d =  Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean:
        String k = "true";
        System.out.println(k );
        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);

        //int to String conversioni
        int j = 200;
        System.out.println(j+20);
        String s = String.valueOf(j);
        System.out.println(s+20);

    }





}
