package PractisePrograms.Encapsulation;

public class Student {

    String name;

    private int age;

    int rollNo;

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
