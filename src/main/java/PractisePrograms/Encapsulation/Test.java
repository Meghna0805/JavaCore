package PractisePrograms.Encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Radhe";
        student.setAge(18);
        student.rollNo = 1111;
        System.out.println(student.name);
        System.out.println(student.getAge());
        System.out.println(student.rollNo);
    }
}
