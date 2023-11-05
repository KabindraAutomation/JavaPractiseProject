package Collection;

import javax.swing.*;
import java.util.HashSet;

public class School {


    public static void main(String[] args) {
        HashSet<Student>school = new HashSet<Student>();
        Student s1 = new Student("John",1);
        Student s2 = new Student("Jane",2);
        Student s3 = new Student("mike",1);
        Student s4 = new Student("mike",1);
        school.add(s1);school.add(s2);school.add(s3);school.add(s4);
        System.out.println(school.size());
    }

}
