package Collection;

import java.util.ArrayList;

public class ListCollTest {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Azle");
        names.add("Palu");
        names.add("Azle");
        names.add("Nipu");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("Azle");
        System.out.println(names);

        System.out.println(names.size());

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(12);
    }
}
