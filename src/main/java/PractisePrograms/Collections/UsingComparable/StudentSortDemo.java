package PractisePrograms.Collections.UsingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("John Smith", 3.9));
        students.add(new Student("Mohn Smith", 2.8));
        students.add(new Student("Tohn Smith", 4.7));
        students.add(new Student("Dohn Smith", 2.6));

        //Sort using natural order(defined by Comparable)
        Collections.sort(students);

        System.out.println("\nSorted Students(by cgpa): ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
