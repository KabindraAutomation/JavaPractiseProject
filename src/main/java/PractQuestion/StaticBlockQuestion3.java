package PractQuestion;

public class StaticBlockQuestion3 {

    //Similarity and Difference between static block and static method?
    //and How can we create objects if we make the constructor private?
    int age;
    private StaticBlockQuestion3(){
    age = 30;

    }


    public static void main(String[] args) {
        StaticBlockQuestion3 obj = new StaticBlockQuestion3();
        System.out.println(obj.age);

    }
    }
