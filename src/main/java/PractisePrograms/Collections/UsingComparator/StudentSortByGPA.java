package PractisePrograms.Collections.UsingComparator;

import java.util.ArrayList;
import java.util.List;

 class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String toString(){
        return name + " (" + gpa + ")";
    }

    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
}

public class StudentSortByGPA{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", 3.8));
        students.add(new Student("Max Smith", 3.4));
        students.add(new Student("Joe Smith", 3.5));
        students.add(new Student("Amy Smith", 3.5));

        //Sort by GPA descending
        students.sort((s1, s2)->Double.compare(s2.getGpa(), s1.getGpa()));
        System.out.println("Sorted by GPA : " + students);
    }
}
