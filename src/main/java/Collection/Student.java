package Collection;

public class Student {

    int grade;
    String fullName;
    public Student(String fn, int g) {

        grade = g;
        fullName = fn;
    }

    //categorization
    public int hashCode(){
        return grade;
    }

    // duplicate check
    public boolean equals(Object anotherObject){
        Student anotherStuObject =(Student) anotherObject;
        if(this.grade == ((Student) anotherStuObject).grade
                && this.fullName.equals(anotherStuObject.fullName))
            return true;
        else
            return false;

    }





}
