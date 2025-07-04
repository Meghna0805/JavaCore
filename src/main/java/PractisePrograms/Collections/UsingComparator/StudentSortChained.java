package PractisePrograms.Collections.UsingComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentSortChained {
    public static void main(String[]args){
        List<Student> students = Arrays.asList(
             new Student("James", 3.5),
                new Student("Joe", 3.5),
                new Student("Bob", 3.7),
                new Student("Akshit", 3.9)

        );

        //Chained comparator: GPA(desc) then Name(asc)
        students.sort(Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName));

        System.out.println("Sorted by GPA then Name : " + students);
    }
}
